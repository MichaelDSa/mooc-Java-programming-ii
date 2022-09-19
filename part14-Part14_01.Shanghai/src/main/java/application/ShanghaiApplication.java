package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2007,2017,1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number,Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Shanghai Ranking: University of Helsinki");
        lineChart.setLegendVisible(false);
        
        XYChart.Series uOfHRanking = new XYChart.Series();
        uOfHRanking.setName("University of Helsinki");
       
        String ranks = "73 68 72 72 74 73 76 73 67 56 56";
        String[] partRanks = ranks.split(" ");
        int years = 2007;
        for(int i = 0; i <= 10; i++) {
            uOfHRanking.getData().add(new XYChart.Data(years + i,Integer.valueOf(partRanks[i])));
        }
        
        lineChart.getData().add(uOfHRanking);
        
        Scene chart = new Scene(lineChart, 640, 480);
        window.setScene(chart);
        window.show();
    }

    public static void main(String[] args) {
        
        
        launch(ShanghaiApplication.class);
        System.out.println("Hello world!");
    }

}
