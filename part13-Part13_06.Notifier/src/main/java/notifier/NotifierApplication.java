package notifier;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        TextField topTF = new TextField();
        Button midB = new Button("Update");
        Label bottomL = new Label();
        
        midB.setOnAction((event) ->{ 
            bottomL.setText(topTF.getText());
        });
        
        VBox VComponents = new VBox();
        VComponents.setSpacing(5);
        VComponents.getChildren().addAll(topTF, midB, bottomL);
        
        Scene scene = new Scene(VComponents);
        
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(NotifierApplication.class);
        
    }

}
