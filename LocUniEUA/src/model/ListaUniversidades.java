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
    Collection<Universidade> universidades;
    public DefaultTableModel dtm = new DefaultTableModel();
    DadosGraficos dg = new DadosGraficos();
    
    
    
    public ListaUniversidades(int filtro){
        this.filtro = filtro;
        universidades = new ArrayList<>();
        dtm.setColumnIdentifiers(new Object[]{"Id", "Nome", "Endereco", "Cidade", "Codigo", "Adm", "TituloAdm", "Website", "Condado", "Longitude", "Latitude"});
    }
    
    public void load(URL url) throws IOException{
        Reader source = new InputStreamReader(url.openStream());
        CSVReader reader = new CSVReader(source, ',');
        String[] line;
        
            if(filtro == 0){
                List<String> valoresEstado = new ArrayList<String>();
                List<String> valoresCidade = new ArrayList<String>();
                
                while((line = reader.readNext()) != null){
                    if(!(valoresEstado.contains(line[4])) && !(line[4].equals("STABBR"))){
                        view.Main.comboEstado.addItem(line[4]);
                        valoresEstado.add(line[4]);
                    }
                    
                    if(!(valoresCidade.contains(line[3])) && !(line[3].equals("CITY"))){
                        view.Main.comboCidade.addItem(line[3]);
                        valoresCidade.add(line[3]);
                    }
                    
                    
                }
            }
            
            if(filtro == 1){
                while((line = reader.readNext()) != null){
                
                if(Main.valorBusca.getText().equals("")){
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
                        dg.adicionarDado(line[3]);
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

                    //System.out.println(line[0] + line[1] + line[2] + "\n");
                }
                else if(line[1].toLowerCase().contains(Main.valorBusca.getText().toLowerCase())){
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
                        dg.adicionarDado(line[3]);
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

                    //System.out.println(line[0] + line[1] + line[2] + "\n");
                }
                
                
                }
            }
            
            if(filtro == 2){
                while((line = reader.readNext()) != null){
                    
                   
                if(Main.valorBusca.getText().equals("") && Main.comboEstado.getSelectedItem().toString().equals(line[4])){
                                       
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
                        dg.adicionarDado(line[3]);
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

                    //System.out.println(line[0] + line[1] + line[2] + "\n");
                }
                else 
                    if(line[1].toLowerCase().contains(Main.valorBusca.getText().toLowerCase()) && Main.comboEstado.getSelectedItem().toString().equals(line[4])){
                    
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
                        dg.adicionarDado(line[3]);
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

                    //System.out.println(line[0] + line[1] + line[2] + "\n");
                }
                
                
                }
            }
            
            if(filtro == 3){
                while((line = reader.readNext()) != null){
                
                if(Main.valorBusca.getText().equals("") && Main.comboEstado.getSelectedItem().toString().equalsIgnoreCase(line[4]) && Main.comboCidade.getSelectedItem().toString().equals(line[3])){
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
                        dg.adicionarDado(line[3]);
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

                    //System.out.println(line[0] + line[1] + line[2] + "\n");
                }
                else if(line[1].toLowerCase().contains(Main.valorBusca.getText().toLowerCase()) && Main.comboEstado.getSelectedItem().toString().equals(line[4]) && Main.comboCidade.getSelectedItem().toString().equals(line[3])){
                                       
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
                        dg.adicionarDado(line[3]);
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

                    //System.out.println(line[0] + line[1] + line[2] + "\n");
                }
                
                
                }
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
