package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        // BUTTONS INTERFACE
        BorderPane bp = new BorderPane();                      
        HBox selection = new HBox();
        selection.setPadding(new Insets(20,20,20,20));
        selection.setSpacing(10);
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");  
        selection.getChildren().addAll(joke,answer,explanation);
        bp.setTop(selection);
        
        //SET INITIAL VIEW:
        StackPane initialView = eventResult("What do you call a bear with no teeth?");
        bp.setCenter(initialView);
       
        // SET UP EVENT HANDLING
        joke.setOnAction((event) -> bp.setCenter(initialView));
        answer.setOnAction((event) -> bp.setCenter(eventResult("A gummy bear.")));
        explanation.setOnAction((event) -> bp.setCenter(eventResult("The bear has not teeth - just gums... \n... So he's a gummy bear! HAHAHAHA")));
        
        //CREATE & SHOW MAIN SCENE
        Scene scene = new Scene(bp);
        window.setScene(scene);
        window.show();
        
    }
        
        private StackPane eventResult(String str) {
            
            StackPane sp = new StackPane();
            sp.setPrefSize(300,180);
            sp.getChildren().add(new Label(str));
            sp.setAlignment(Pos.CENTER);
            
            return sp;
            
        }

    public static void main(String[] args) {
        launch(JokeApplication.class);
        System.out.println("Hello world!");
    }
}
