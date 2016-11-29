package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.DadosGraficos;
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
    DadosGraficos dg = new DadosGraficos();
    
    public Seeker(List<Universidade> universidadesListadas){
        this.universidades = universidadesListadas;
    }
    
    private void definirColunas(){
            dtm.setColumnIdentifiers(new Object[]{
            universidades.get(0).getId(),
            universidades.get(0).getNome(),
            universidades.get(0).getEndereco(),
            universidades.get(0).getCidade(),
            universidades.get(0).getCodigo(),
            universidades.get(0).getAdm(),
            universidades.get(0).getTituloAdm(),
            universidades.get(0).getWebsite(),
            universidades.get(0).getCondado(),
            universidades.get(0).getLongitude(),
            universidades.get(0).getLatitude()
            });
            
    }
    
    public void limparTabela(){
        dtm = new DefaultTableModel();
        definirColunas();        
        Main.tabelaDados.setModel(dtm);
        dg = new DadosGraficos();
    }
    
    public void buscaPorNome(String nome){
        definirColunas();
        
        Iterator<Universidade> itr = universidades.iterator();
        while(itr.hasNext()){
            Universidade uni = itr.next();
            
            if(uni.getNome().toLowerCase().contains(nome.toLowerCase())){
                dtm.addRow(new Object[]{
                    uni.getId(),
                    uni.getNome(),
                    uni.getEndereco(),
                    uni.getCidade(),
                    uni.getCodigo(),
                    uni.getAdm(),
                    uni.getTituloAdm(),
                    uni.getWebsite(),
                    uni.getCondado(),
                    uni.getLongitude(),
                    uni.getLatitude()
                });
                
                dg.adicionarDado(uni.getCidade());
            }
        }
        
        Main.tabelaDados.setModel(dtm);
    }
    
    public void buscarPorNomeEstado(String nome, String estado){
        definirColunas();
        
        Iterator<Universidade> itr = universidades.iterator();
        while(itr.hasNext()){
            Universidade uni = itr.next();
            
            if((uni.getNome().toLowerCase().contains(nome.toLowerCase())) && (uni.getCodigo().equals(estado))){
                dtm.addRow(new Object[]{
                    uni.getId(),
                    uni.getNome(),
                    uni.getEndereco(),
                    uni.getCidade(),
                    uni.getCodigo(),
                    uni.getAdm(),
                    uni.getTituloAdm(),
                    uni.getWebsite(),
                    uni.getCondado(),
                    uni.getLongitude(),
                    uni.getLatitude()
                });
                
                dg.adicionarDado(uni.getCidade());
            }
        }
        
        Main.tabelaDados.setModel(dtm);
    
    }
    
    public void buscarPorNomeEstadoCidade(String nome, String estado, String cidade){
        definirColunas();
        
        Iterator<Universidade> itr = universidades.iterator();
        while(itr.hasNext()){
            Universidade uni = itr.next();
            
            if((uni.getNome().toLowerCase().contains(nome.toLowerCase())) && (uni.getCodigo().equals(estado)) && (uni.getCidade().equals(cidade))){
                dtm.addRow(new Object[]{
                    uni.getId(),
                    uni.getNome(),
                    uni.getEndereco(),
                    uni.getCidade(),
                    uni.getCodigo(),
                    uni.getAdm(),
                    uni.getTituloAdm(),
                    uni.getWebsite(),
                    uni.getCondado(),
                    uni.getLongitude(),
                    uni.getLatitude()
                });
                
                dg.adicionarDado(uni.getCidade());
            }
        }
        
        Main.tabelaDados.setModel(dtm);
    
    }

    public DadosGraficos getDg() {
        return dg;
    }
    
    
    
}