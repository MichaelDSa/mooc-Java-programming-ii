package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
        

public class BorderPaneApplication extends Application {
    
    @Override
    public void start(Stage window) {
        BorderPane bp = new BorderPane();
        
        bp.setTop(new Label("NORTH"));
        bp.setRight(new Label("EAST"));
        bp.setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(bp,300,500);
        
        window.setScene(view);
        window.show();
    }


    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
        System.out.println("Hello world!");
    }

}
