package application;

import java.util.Map;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CyclingStatisticsApplication extends Application {
    @Override
public void start(Stage stage) {
    // The class Random is used to randomize the dice rolls
    Random random = new Random();

    NumberAxis xAxis = new NumberAxis();
    // y-axes represents the average of the rolls. The average is always between [1-6]
    NumberAxis yAxis = new NumberAxis(1, 6, 1);

    LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
    // removing elements of the chart, e.g. circles on points
    lineChart.setLegendVisible(false);
    lineChart.setAnimated(false);
    lineChart.setCreateSymbols(false);

    // we create a variable representing the data and add it to the chart
    XYChart.Series average = new XYChart.Series();
    lineChart.getData().add(average);

    new AnimationTimer() {
        private long previous;
        private long sum;
        private long count;

        @Override
        public void handle(long current) {
            if (current - previous < 100_000_000L) {
                return;
            }

            previous = current;

            // roll the dice
            int number = random.nextInt(6) + 1;

            // we grow the sum and increment the count
            sum += number;
            count++;

            // we add a new data point to the chart
            average.getData().add(new XYChart.Data(count, 1.0 * sum / count));
            if (average.getData().size() > 100) {
    average.getData().remove(0);
    xAxis.setLowerBound(xAxis.getLowerBound() + 1);
    xAxis.setUpperBound(xAxis.getUpperBound() + 1);
}
        }
    }.start();

    Scene scene = new Scene(lineChart, 400, 300);
    stage.setScene(scene);
    stage.show();
}
    
    
    
    
    
    
    
    
    
    
//
//    @Override
//    public void start(Stage stage) {
//
//        CyclingStatistics statistics = new CyclingStatistics("helsinki-cycling-statistics.csv");
//
//        GridPane gridPane = new GridPane();
//        gridPane.setVgap(10);
//        gridPane.setHgap(10);
//        gridPane.setPadding(new Insets(10, 10, 10, 10));
//
//        gridPane.add(new Label("Choose the examined location"), 0, 0);
//
//        ObservableList<String> data = FXCollections.observableArrayList();
//        data.addAll(statistics.locations());
//
//        ListView<String> list = new ListView<>(data);
//        gridPane.add(list, 0, 1);
//
//        CategoryAxis xAxis = new CategoryAxis();
//        NumberAxis yAxis = new NumberAxis();
//        xAxis.setLabel("Year / Month");
//        yAxis.setLabel("Cyclists");
//
//        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
//        chart.setAnimated(false);
//        chart.setLegendVisible(false);
//
//        list.setOnMouseClicked((MouseEvent event) -> {
//            String chosen = list.getSelectionModel().getSelectedItem();
//            Map<String, Integer> values = statistics.monthlyCyclists(chosen);
//            chart.getData().clear();
//            XYChart.Series chartData = new XYChart.Series();
//
//            values.keySet().stream().forEach(time -> {
//                chartData.getData().add(new XYChart.Data(time, values.get(time)));
//            });
//
//            chart.getData().add(chartData);
//        });
//
//        gridPane.add(chart, 1, 0, 1, 2);
//
//        Scene view = new Scene(gridPane);
//
//        stage.setScene(view);
//        stage.show();
//    }

    public static void main(String[] args) {
        launch(CyclingStatisticsApplication.class);
    }

}
