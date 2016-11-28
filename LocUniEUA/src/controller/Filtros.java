package controller;

import java.awt.CardLayout;
import java.io.File;
import java.net.URL;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DadosGraficos;
import model.ListaUniversidades;
import view.Main;

/**
 *
 * @author JoãoVictor
 * Comentário por Luís
 * Comentário por Karina
 * Olá
 */
public class Filtros{
    int tiposelecao = 0;
    DadosGraficos dg = new DadosGraficos();
    
    public Filtros(int tipo){
        tiposelecao = tipo;
    }

    public Map<String, Integer> getDg() {
        if(dg.map.isEmpty()){
            System.out.println("Está vazio em Filtros");
        }
        return dg.map;
    }
    
    public Filtros(){
    }
   
    public void run() {     
            //Thread.sleep(1000);
            try{                
                URL url;                
                url = new URL("https://inventory.data.gov/dataset/032e19b4-5a90-41dc-83ff-6e4cd234f565/resource/38625c3d-5388-4c16-a30f-d105432553a4/download/postscndryunivsrvy2013dirinfo.csv");
                
                if(tiposelecao == 0){
                    /*ListaUniversidades lisuni = new ListaUniversidades(0);
                    lisuni.load(url);
                    System.out.println("Obtido da Web: " + lisuni.toString());
                  

                    File arq = new File("universidades.ser");
                    lisuni.save(arq);
                    ListaUniversidades relisuni = new ListaUniversidades(0);
                    relisuni.load(arq);
                    System.out.println("Obtido localmente: " + relisuni.toString());*/
                }
                
                if(tiposelecao == 1){
                    /*ListaUniversidades lisuni = new ListaUniversidades(1);
                    lisuni.load(url);
                    System.out.println("Obtido da Web: " + lisuni.toString());
                    dg.map = lisuni.getDg();

                    File arq = new File("universidades.ser");
                    lisuni.save(arq);
                    ListaUniversidades relisuni = new ListaUniversidades(1);
                    relisuni.load(arq);
                    System.out.println("Obtido localmente: " + relisuni.toString());

                    Main.tabelaDados.setModel(lisuni.getDtm());
                    
                    CardLayout cl = (CardLayout) Main.Principal.getLayout();
                    cl.show(Main.Principal, "Graficos");
                    (Main.Principal).setVisible(true);*/
                }
                
                if(tiposelecao == 2){
                    /*ListaUniversidades lisuni = new ListaUniversidades(2);
                    lisuni.load(url);
                    System.out.println("Obtido da Web: " + lisuni.toString());
                    dg.map = lisuni.getDg();                   

                    File arq = new File("universidades.ser");
                    lisuni.save(arq);
                    ListaUniversidades relisuni = new ListaUniversidades(2);
                    relisuni.load(arq);
                    System.out.println("Obtido localmente: " + relisuni.toString());

                    Main.tabelaDados.setModel(lisuni.getDtm());
                    
                    CardLayout cl = (CardLayout) Main.Principal.getLayout();
                    cl.show(Main.Principal, "Graficos");
                    (Main.Principal).setVisible(true);*/
                }
                
                if(tiposelecao == 3){
                    /*ListaUniversidades lisuni = new ListaUniversidades(3);
                    lisuni.load(url);
                    System.out.println("Obtido da Web: " + lisuni.toString());
                    dg.map = lisuni.getDg();

                    File arq = new File("universidades.ser");
                    lisuni.save(arq);
                    ListaUniversidades relisuni = new ListaUniversidades(3);
                    relisuni.load(arq);
                    System.out.println("Obtido localmente: " + relisuni.toString());

                    Main.tabelaDados.setModel(lisuni.getDtm());
                    
                    CardLayout cl = (CardLayout) Main.Principal.getLayout();
                    cl.show(Main.Principal, "Graficos");
                    (Main.Principal).setVisible(true);*/
                }
                
                
                
            }
            catch(Exception ex){
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
