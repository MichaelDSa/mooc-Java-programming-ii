package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {    
    
    public ArrayList<String> allRows() {
        ArrayList<String> rows = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {            
            while(scanner.hasNextLine()) {
                rows.add(scanner.nextLine().split("\n")[0]);                
            }            
        } catch(Exception e) {
            System.out.println("Caught Exception in allRows(): " + e.toString());
        }
        return rows;
    }
    
    public int year(int index) {        
        return strCoordinates(0,index).trim().matches("[0-9]{4}") ? 
                Integer.valueOf(strCoordinates(0,index)) : -1;
    }
    
    public int numberOfRows() {
        return allRows().size();
    }
    
    public int numberOfColumns() {        
        return allRows().get(0).split("\t").length;
    }
    
    public String strCoordinates(int row, int col) {    
        return allRows().get(row).split("\t")[col];
    }
    
    public double doubleCoordinates(int row, int col) {
        return strCoordinates(row,col).matches("[0-9]+.[0-9]+") ? 
                Double.valueOf(strCoordinates(row,col)) : -1;
    }    
    
    public HashMap<String, HashMap<Integer,Double>> data() {        
        HashMap<String, HashMap<Integer, Double>> partyMap = new HashMap<>();        
        
        for(int i = 1; i < numberOfRows(); i++) {            
            HashMap<Integer,Double> yearMap = new HashMap<>();            
            for(int j = 1; j < numberOfColumns(); j++) {
                if(doubleCoordinates(i,j) != -1) {
                    yearMap.put(year(j), doubleCoordinates(i,j));                    
                }
            }
            partyMap.put(strCoordinates(i,0), yearMap);                     
        }        
        return partyMap;
    }    

    @Override
        public void start(Stage window) {
            NumberAxis xAxis = new NumberAxis(1968,2008,4);
            NumberAxis yAxis = new NumberAxis(0,30,5);
            
            LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
            lineChart.setTitle("Relative Support of Major Finnish Political Parties: 1968 to 2008");
            
            
            data().keySet().stream().forEach(party -> {
            
                XYChart.Series data = new XYChart.Series();
                data.setName(party);
                
                data().get(party).entrySet().stream().forEach(pair -> { 
                    data.getData().add(new XYChart.Data(pair.getKey(),pair.getValue()));
                });
                
                lineChart.getData().add(data);
            
            });

            Scene chart = new Scene(lineChart,640,480);
            window.setScene(chart);
            window.show();        
    }
/*
*   the code below works, but did not pass the 
*   test because it does not use a nested HashMap.
*   ABOVE CODE: creates a correct chart, but does not
*   produce the same chart as the example; Uses the stream command
*   suggested by the example.        
*   BELOW CODE: produces chart exactly the same as the example.
*   it is actually much closer to the solution, which
*   actually doesn't use a hash map, but uses ArrayList<String[]> to 
*   get the data from the file, and doesn't use the stream commands 
*   given in the example.
*        
*/    
//    @Override
//    public void start(Stage window) {        
//        String[][] data = new String[8][12];
//        try(Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
//            int i = 0;
//            while(scanner.hasNextLine()) {
//                String[] rowSplit = scanner.nextLine().split("\t");                               
//                for(int j = 0; j < rowSplit.length; j++) {
//                    data[i][j] = rowSplit[j];
//                }                
//                i++;
//            }
//        } catch(Exception e) {
//            System.out.println("Caught exception: " + e.toString());
//        }
//        
//        NumberAxis xAxis = new NumberAxis(1968,2008,4);
//        NumberAxis yAxis = new NumberAxis(0,30,5);
//        
//        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
//        lineChart.setTitle("Relative Support of Major Finnish Political Parties: 1968 to 2008");
//        
//        ArrayList<XYChart.Series> partyData = new ArrayList<>();
//        for(int i = 0; i < data.length; i++) {
//            if(i > 0) {
//                partyData.add(new XYChart.Series());
//                partyData.get(i-1).setName(data[i][0]);
//                for(int j = 1; j < data[i].length; j++) {                
//                    if(!data[i][j].trim().equals("-")) {
//                        partyData.get(i-1).getData().add(new XYChart.Data(Double.valueOf(data[0][j]),Double.valueOf(data[i][j])));
//                    }
//                }
//                lineChart.getData().add(partyData.get(i-1));
//            }            
//        }
//        
//        Scene chart = new Scene(lineChart,640,480);
//        window.setScene(chart);
//        window.show();     
//    }

    public static void main(String[] args) {        
        launch(PartiesApplication.class);
        System.out.println("Hello world!");
    }
}
