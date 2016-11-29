package model;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author JoãoVictor
 */

public class DadosGraficos {
    public Map<String, Integer> map = new TreeMap<String, Integer>();
    public SortedSet<Map.Entry<String,Integer>> dadosOrdenados = new TreeSet<Map.Entry<String,Integer>>();
    
    
    
    public void adicionarDado(String Localidade){
        if(map.containsKey(Localidade)){
            map.put(Localidade, map.get(Localidade)+1);            
        }
        else{
            map.put(Localidade, 1);
        }
        System.out.println(Localidade + map.get(Localidade));
    }
    
    public void mostrarDados(){
        if(map.isEmpty()){
            System.out.println("Está Vazio!");
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public Map<String, Integer> getMap() {
        return map;
    }
    
    public void OrdenarDados(){
        dadosOrdenados = entriesSortedByValues(map);
    }
    
    public Object[] top10(){
        System.out.println(System.lineSeparator());
        Object[] dados = dadosOrdenados.toArray();
        Object[] top10 = null;
        int controladora = 0;
        
        if(dados.length >= 10){
            top10 = new Object[10];
            for(int i = 0; i < dados.length; i++){           
                if(i > dados.length-11){
                    System.out.println(dados[i]);
                    top10[controladora] = dados[i];
                    controladora++;
                }                
            }
            
        } else{
            System.out.println("Tamanho: " + dados.length);
            top10 = new Object[dados.length];
            for(int i = 0; i < dados.length; i++){
                top10[controladora] = dados[i];
                controladora++;                              
            }
        }
        
        
        
        return top10;
    }
    
    public void lerDadosOrdenados(){
      Iterator it = dadosOrdenados.iterator();

      while (it.hasNext()) {
         Object element = it.next();
         System.out.println(element.toString());
      }
    }
    
    static <K,V extends Comparable<? super V>>  SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
            new Comparator<Map.Entry<K,V>>() {
                @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1;
                }
            }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }

    public SortedSet<Map.Entry<String, Integer>> getDadosOrdenados() {
        return dadosOrdenados;
    }
    
}