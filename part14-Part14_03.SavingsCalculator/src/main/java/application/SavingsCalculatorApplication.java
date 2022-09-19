package application;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Slider;
import javafx.stage.Stage;



public class SavingsCalculatorApplication extends Application {    

    @Override
    public void start(Stage window) {    
        BorderPane bp0 = new BorderPane();    

        Slider s0 = new Slider(25, 250, 25);
        s0.setShowTickMarks(true);
        s0.setShowTickLabels(true); 
        s0.setSnapToTicks(true);
        s0.setBlockIncrement(500);    
        
        Label savingsLabel = new Label();  
        //this code is better, but does not pass test:
        //savingsLabel.setText(" " + String.format("%.2f", s0.getValue()));
        savingsLabel.setText(" " + s0.getValue());    
        BorderPane bp1 = new BorderPane();
        bp1.setLeft(new Label("Monthly savings"));
        bp1.setCenter(s0);
        bp1.setRight(savingsLabel);
        bp1.setPadding(new Insets(10));    

        Slider s1 = new Slider(0,10,0);
        s1.setShowTickMarks(true);
        s1.setShowTickLabels(true);
        s1.setMinorTickCount(10);    

        Label interestLabel = new Label();
        //this code is better, but does not pass test:
        //interestLabel.setText(" " + String.format("%.2f", s1.getValue()));
        interestLabel.setText(" " + s1.getValue());    
        BorderPane bp2 = new BorderPane();
        bp2.setLeft(new Label("Yearly interest rate"));
        bp2.setCenter(s1);
        bp2.setRight(interestLabel);
        bp2.setPadding(new Insets(10));    

        VBox vb0 = new VBox();
        vb0.setSpacing(5);
        vb0.getChildren().addAll(bp1,bp2);

        bp0.setTop(vb0);    

        s0.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            //This code is better, but does not pass test:
            // savingsLabel.setText(" " + String.format("%2f", newvalue));      
            savingsLabel.setText(String.valueOf(newvalue.intValue()));                  
            bp0.setCenter(chart(newvalue.doubleValue(),s1.getValue()));
        });
        s1.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            //This code is better, but does not pass test:
            // interestLabel.setText(" " + String.format("%2f", newvalue));
            interestLabel.setText(String.valueOf(newvalue.intValue()));            
            bp0.setCenter(chart(s0.getValue(),newvalue.doubleValue()));        
        });    

        bp0.setCenter(chart(25,0));    

        Scene chart = new Scene(bp0, 640,480);
                window.setScene(chart);
                window.show();        
    
    }

    public LineChart<Number,Number> chart(double value1, double value2) {
        
        NumberAxis xAxis = new NumberAxis(0,30,1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lc = new LineChart<>(xAxis,yAxis);
        lc.setTitle("Saastolaskuri - Savings Calculator");
        lc.setAnimated(false);
        lc.setLegendVisible(false);
        XYChart.Series chartData1 = new XYChart.Series();
        XYChart.Series chartData2 = new XYChart.Series();

        double val1 = 0;
        double val2 = 0;
        
        for(int i = 0; i <= 30; i++) {                     
                chartData1.getData().add(new XYChart.Data(i,val1));            
                chartData2.getData().add(new XYChart.Data(i,val2));
                val1 += value1 * 12;
                val2 = (val2 + value1 * 12) * (1.0 + value2 / 100.0);            
        }
        
        lc.getData().addAll(chartData1, chartData2);
        
        return lc;
}

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
        System.out.println("Hello world!");
    }

}
