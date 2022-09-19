package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
        


public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        BorderPane bp = new BorderPane();       
        
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(new Label("Letters: 0"));
        hbox.getChildren().add(new Label("Words: 0"));
        hbox.getChildren().add(new Label("The longest word is:"));
        
        bp.setBottom(hbox);
        bp.setCenter(new TextArea(""));
        
        
        Scene scene = new Scene(bp);
        
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
