package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    @Override
    public void start(Stage window) throws Exception {
        //FIRST VIEW
        GridPane gp = new GridPane();
        Label enterName = new Label("Enter your name and start.");
        TextField tf = new TextField();
        Button start = new Button("Start");
        gp.add(enterName, 0, 0);
        gp.add(tf, 0, 1);
        gp.add(start, 0, 2);
        gp.setPrefSize(300,180);
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(20,20,20,20));
        Scene enter = new Scene(gp);
                
        //SECOND VIEW
        GridPane gp2 = new GridPane();
        Label welcome = new Label("Welcome name!");
        Label name = new Label();
        gp2.addRow(0, welcome);
        gp2.setPrefSize(300,180);
        gp2.setAlignment(Pos.CENTER);
        gp2.setVgap(10);
        gp2.setHgap(10);
        gp2.setPadding(new Insets(20,20,20,20));      
        Scene WelcScene = new Scene(gp2);
        
        // EVENT HANDLING
        start.setOnAction((event) -> {
            welcome.setText("Welcome " + tf.getText() + "!");
            window.setScene(WelcScene);
                });
        
        window.setScene(enter);
        window.show();
        
        
        
    }


    public static void main(String[] args) {
        launch(GreeterApplication.class);
        System.out.println("Hellow world! :3");
    }
}
