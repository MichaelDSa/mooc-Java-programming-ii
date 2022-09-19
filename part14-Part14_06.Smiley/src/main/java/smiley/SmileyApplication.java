package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {
    @Override
    public void start(Stage window) {
        
        BorderPane bp1 = new BorderPane();        
        Canvas canvas1 = new Canvas(400,400);        
        GraphicsContext gc1 = canvas1.getGraphicsContext2D();        

        gc1.setFill(Color.WHITE);
        gc1.clearRect(0, 0, 640, 480);
        
        gc1.setFill(Color.BLACK);
        gc1.fillRect(80, 40, 50, 50);
        gc1.fillRect(250, 40, 50, 50);
        gc1.fillRect(30, 200, 50, 50);
        gc1.fillRect(300, 200, 50, 50);
        gc1.fillRect(80, 250, 220 , 50);
        
        bp1.setCenter(canvas1);
        
        Scene draw = new Scene(bp1);
        
        window.setScene(draw);
        window.show();        
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
        System.out.println("Hello world!");
    }

}
