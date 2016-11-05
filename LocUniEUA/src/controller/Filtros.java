package controller;

import java.awt.CardLayout;
import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ListaUniversidades;
import view.Main;

/**
 *
 * @author JoãoVictor
 * Comentário por Luís
 * Comentário por Karina
 * Olá
 */
public class Filtros implements Runnable{
    int tiposelecao = 1;
    int filtrosimples;
    String valorsimples;
    
    public Filtros(int tipo){
        tiposelecao = tipo;
    }
   
    @Override
    public void run() {     
            //Thread.sleep(1000);
            try{                
                URL url;                
                url = new URL("https://inventory.data.gov/dataset/032e19b4-5a90-41dc-83ff-6e4cd234f565/resource/38625c3d-5388-4c16-a30f-d105432553a4/download/postscndryunivsrvy2013dirinfo.csv");
                
                if(tiposelecao == 0){
                    ListaUniversidades lisuni = new ListaUniversidades();
                    lisuni.load(url);
                    System.out.println("Obtido da Web: " + lisuni.toString());

                    File arq = new File("universidades.ser");
                    lisuni.save(arq);
                    ListaUniversidades relisuni = new ListaUniversidades();
                    relisuni.load(arq);
                    System.out.println("Obtido localmente: " + relisuni.toString());

                    Main.tabelaDados.setModel(lisuni.getDtm());
                }
                else{
                    ListaUniversidades lisuni = new ListaUniversidades(filtrosimples, valorsimples);
                    lisuni.load(url);
                    System.out.println("Obtido da Web: " + lisuni.toString());

                    File arq = new File("universidades.ser");
                    lisuni.save(arq);
                    ListaUniversidades relisuni = new ListaUniversidades();
                    relisuni.load(arq);
                    System.out.println("Obtido localmente: " + relisuni.toString());

                    Main.tabelaDados.setModel(lisuni.getDtm());
                }
                
            }
            catch(Exception ex){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        CardLayout cl = (CardLayout) Main.Principal.getLayout();
        cl.show(Main.Principal, "Graficos");
        (Main.Principal).setVisible(true);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
