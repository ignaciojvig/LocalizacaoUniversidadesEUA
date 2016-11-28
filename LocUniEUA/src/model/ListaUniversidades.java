package model;


import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Main;

/**
 *
 * @author JoãoVictor
 */
public class ListaUniversidades {
    int filtro;
    public List<Universidade> universidades = new ArrayList<>();
    public DefaultTableModel dtm = new DefaultTableModel();
    DadosGraficos dg = new DadosGraficos();
    
    public ListaUniversidades(){
    }
    
    public ListaUniversidades(int filtro){
        this.filtro = filtro;
        dtm.setColumnIdentifiers(new Object[]{"Id", "Nome", "Endereco", "Cidade", "Codigo", "Adm", "TituloAdm", "Website", "Condado", "Longitude", "Latitude"});
    }
    
    public void load() throws IOException{
        URL url = new URL("https://inventory.data.gov/dataset/032e19b4-5a90-41dc-83ff-6e4cd234f565/resource/38625c3d-5388-4c16-a30f-d105432553a4/download/postscndryunivsrvy2013dirinfo.csv");
        
        Reader source = new InputStreamReader(url.openStream());
        CSVReader reader = new CSVReader(source, ',');
        String[] line;
        
        while((line = reader.readNext()) != null){
            Universidade universidade = new Universidade();
                    
            if(line[0] != null){
                universidade.setId(line[0]);
            }
        
            if(line[1] != null){
                universidade.setNome(line[1]);
            }

            if(line[2] != null){
                universidade.setEndereco(line[2]);
            }            
            
            if(line[3] != null){
                universidade.setCidade(line[3]);
            }
            
            if(line[4] != null){
                universidade.setCodigo(line[4]);
            }
            
            if(line[8] != null){
                universidade.setAdm(line[8]);
            }
            
            if(line[9] != null){
                universidade.setTituloAdm(line[9]);
            }            
            
            if(line[17] != null){
                universidade.setWebsite(line[17]);
            }
            
            if(line[62] != null){
                universidade.setCondado(line[62]);
            }
            
            if(line[64] != null){
                universidade.setLongitude(line[64]);
            }
            
            if(line[65] != null){
                universidade.setLatitude(line[65]);
            }

            universidades.add(universidade);
                 
            }     
        reader.close();
        source.close();
        
    }
    
    public DefaultTableModel getDtm() {
        //dtm.setColumnIdentifiers();
        if(dtm == null){
            JOptionPane.showMessageDialog(null, "Vazio");
        }
        //else JOptionPane.showMessageDialog(null, "Não Vazio");
        return dtm;
    }

    public Map<String, Integer> getDg() {
        if(dg.map.isEmpty()){
            System.out.println("Está vazio em ListaUniversidades");
        }
        return dg.getMap();
    }
    
    
    
    public void save(File persist) throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(persist));
        if(universidades != null){
            output.writeObject(universidades);
        }
    }
    
    public void load(File persist) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(persist));
        universidades = (List) input.readObject();
    }
    
    @Override
    public String toString(){
        String resposta = "Null";
        if(universidades != null){
            resposta = "[ ";
            for(Universidade universidade : universidades){
                resposta = resposta.concat(universidade.getId() + "");
            }
            resposta = resposta.concat("]");
        }
        return resposta;
    }
    
}
