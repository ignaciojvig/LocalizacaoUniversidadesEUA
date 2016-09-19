package Model;

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
import java.util.Collection;

/**
 *
 * @author JoãoVictor
 */
public class ListaUniversidades {
    Collection<Universidade> universidades;
    
    public ListaUniversidades(){
        universidades = new ArrayList<>();
    }
    
    public void load(URL url) throws IOException{
        Reader source = new InputStreamReader(url.openStream());
        CSVReader reader = new CSVReader(source, ';');
        String[] line;
        while((line = reader.readNext()) != null){
            Universidade universidade = new Universidade();
            universidade.setId(line[1]);
            universidade.setNome(line[2]);
            universidade.setEndereco(line[3]);
            universidade.setCidade(line[4]);
            universidade.setCodigo(line[5]);
            universidade.setAdm(line[9]);
            universidade.setTituloAdm(line[10]);
            universidade.setWebsite(line[16]);
            universidade.setCondado(line[63]);
            universidade.setLongitude(line[65]);
            universidade.setLatitude(line[66]);
            
            universidades.add(universidade);
        }
        reader.close();
        source.close();
    }
    
    public void save(File persist) throws IOException{
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(persist));
        if(universidades != null){
            output.writeObject(universidades);
        }
    }
    
    public void load(File persist) throws IOException, ClassNotFoundException{
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(persist));
        universidades = (Collection) input.readObject();
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
