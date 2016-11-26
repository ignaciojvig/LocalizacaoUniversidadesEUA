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
        
        System.out.println("Ta indo o monstro");
        
        xAxis.setLabel("Estados");
        
        final LineChart<String,Number> lineChart = 
                new LineChart<>(xAxis,yAxis);
       
        lineChart.setTitle("Cidades com maior número de Universidades");
        
        XYChart.Series series1 = new XYChart.Series();
        
        for(int controladora = 0; controladora < 10; controladora++){
            String dadosEmString = dados[controladora].toString();
            System.out.println(dadosEmString);
            int pos = dadosEmString.indexOf("=");
            System.out.println(pos);
            System.out.println(dadosEmString.substring(0, pos-1) + " | " + dadosEmString.substring(pos+1));
            series1.setName("Numero de Universidades"); 
            series1.getData().add(new XYChart.Data(dadosEmString.substring(0, pos-1), Integer.parseInt(dadosEmString.substring(pos+1))));
            
        } 
        
        lineChart.getData().addAll(series1);
        
        /*
        series1.setName("Portfolio 1");                
        series1.getData().add(new XYChart.Data("Jan", 23));
        series1.getData().add(new XYChart.Data("Feb", 14));
        series1.getData().add(new XYChart.Data("Mar", 15));
        series1.getData().add(new XYChart.Data("Apr", 24));
        series1.getData().add(new XYChart.Data("May", 34));
        series1.getData().add(new XYChart.Data("Jun", 36));
        series1.getData().add(new XYChart.Data("Jul", 22));
        series1.getData().add(new XYChart.Data("Aug", 45));
        series1.getData().add(new XYChart.Data("Sep", 43));
        series1.getData().add(new XYChart.Data("Oct", 17));
        series1.getData().add(new XYChart.Data("Nov", 29));
        series1.getData().add(new XYChart.Data("Dec", 25));        
        */
     
        return lineChart;
    }
    
}
