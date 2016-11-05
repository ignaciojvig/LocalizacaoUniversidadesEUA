<<<<<<< HEAD
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
import java.util.Collection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoãoVictor
 */
public class ListaUniversidades {
    boolean filtro = false;
    // false = Sem Filtro
    // true = Com Filtro
    int filtrosimples;
    String valorsimples = "";
    Collection<Universidade> universidades;
    public DefaultTableModel dtm = new DefaultTableModel();
    
    
    public ListaUniversidades(){
        universidades = new ArrayList<>();
        dtm.setColumnIdentifiers(new Object[]{"Id", "Nome", "Endereco", "Cidade", "Codigo", "Adm", "TituloAdm", "Website", "Condado", "Longitude", "Latitude"});
    }
    
    public ListaUniversidades(int filtrosimples, String valorsimples){
        universidades = new ArrayList<>();
        dtm.setColumnIdentifiers(new Object[]{"Id", "Nome", "Endereco", "Cidade", "Codigo", "Adm", "TituloAdm", "Website", "Condado", "Longitude", "Latitude"});
        filtro = true;
        this.filtrosimples = filtrosimples;
        this.valorsimples = valorsimples;
    }
    
    public void load(URL url) throws IOException{
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

                dtm.addRow(new Object[]{line[0], line[1], line[2], line[3], line[4], line[8], line[9], line[17], line[62], line[64], line[65]});

                System.out.println(line[0] + line[1] + line[2] + "\n");
            }
         
        
        //tabelaDados.setModel(dtm);        
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
=======
package model;

import view.Main;
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JoãoVictor
 */
public class ListaUniversidades {
    Collection<Universidade> universidades;
    public DefaultTableModel dtm = new DefaultTableModel();
    
    public ListaUniversidades(){
        universidades = new ArrayList<>();
        dtm.setColumnIdentifiers(new Object[]{"Id", "Nome", "Endereco", "Cidade", "Codigo", "Adm", "TituloAdm", "Website", "Condado", "Longitude", "Latitude"});
    }
    
    public void load(URL url) throws IOException{
        
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
            
            dtm.addRow(new Object[]{line[0], line[1], line[2], line[3], line[4], line[8], line[9], line[17], line[62], line[64], line[65]});
            
            System.out.println(line[0] + line[1] + line[2] + "\n");
        } 
        
        //tabelaDados.setModel(dtm);        
        reader.close();
        source.close();
        
    }

    public DefaultTableModel getDtm() {
        //dtm.setColumnIdentifiers();
        if(dtm == null){
            JOptionPane.showMessageDialog(null, "Vazio");
        }
        else JOptionPane.showMessageDialog(null, "Não Vazio");
        return dtm;
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
>>>>>>> origin/master
