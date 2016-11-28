package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.ListaUniversidades;
import model.Universidade;
import view.Main;

/**
 *
 * @author JoãoVictor
 */
public class Seeker {
    private List<Universidade> universidades = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();
    
    public Seeker(List<Universidade> universidadesListadas){
        this.universidades = universidadesListadas;
    }
    
    private void definirColunas(){
        
    }
    
    public void buscaPorNome(){
        definirColunas();
    }
    
}
