package controller;

import java.util.Map;
import java.util.SortedSet;
import javafx.application.Application;
import javafx.application.Platform;
import static javafx.application.Platform.setImplicitExit;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 *
 * @author JoãoVictor
 */
public class Graficos {
    
    public LineChart<String, Number> getChart(Object[] dados) {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis   = new NumberAxis();
        
        
        xAxis.setLabel("Estados");
        
        final LineChart<String,Number> lineChart = 
                new LineChart<>(xAxis,yAxis);
       
        lineChart.setTitle("Cidades com maior número de Universidades");
        
        XYChart.Series series1 = new XYChart.Series();
        
        for(int controladora = 0; controladora < dados.length; controladora++){
            String dadosEmString = dados[controladora].toString();
            System.out.println(dadosEmString);
            int pos = dadosEmString.indexOf("=");
            System.out.println(pos);
            System.out.println(dadosEmString.substring(0, pos) + " | " + dadosEmString.substring(pos+1));
            series1.setName("Numero de Universidades"); 
            series1.getData().add(new XYChart.Data(dadosEmString.substring(0, pos), Integer.parseInt(dadosEmString.substring(pos+1))));
        } 
        
        lineChart.getData().addAll(series1);
        
     
        return lineChart;
    }
    
}
