package controller;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import model.Universidade;
import view.Main;

/**
 *
 * @author JoãoVictor
 */
public class Loader {
    private File arqFiltroEstado = new File("src/view/files/filtroEstado.txt");
 
    public void loadFiltros() throws IOException{
        URL url = new URL("https://inventory.data.gov/dataset/032e19b4-5a90-41dc-83ff-6e4cd234f565/resource/38625c3d-5388-4c16-a30f-d105432553a4/download/postscndryunivsrvy2013dirinfo.csv");
        
        List<String> valoresEstado = new ArrayList<String>();
        
        String[] line;
        
        Reader source = new InputStreamReader(url.openStream());
        CSVReader reader = new CSVReader(source, ',');        
        
        try{            
            BufferedWriter bwEstado = new BufferedWriter(new FileWriter(arqFiltroEstado));
        
            while((line = reader.readNext()) != null){
                if(!(valoresEstado.contains(line[4])) && !(line[4].equals("STABBR") && (line[4].equals("")))){
                    valoresEstado.add(line[4]);
                    bwEstado.write(line[4] + "\n");
                }
            }
            
            bwEstado.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void carregarFiltros() throws FileNotFoundException, IOException{
        BufferedReader brEstado = new BufferedReader(new FileReader(arqFiltroEstado));     
        String linha = "";   
        
        while(linha != null){
            linha = brEstado.readLine();
            Main.comboEstado.addItem(linha);            
        }

        linha = "";
    }
}
