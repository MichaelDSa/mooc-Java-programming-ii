package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Button b = new Button("BUTTON");
        TextField t = new TextField("TEXT FIELD");
        
        FlowPane fp = new FlowPane();
        fp.getChildren().add(t);
        fp.getChildren().add(b);
        
        Scene s = new Scene(fp);
        
        stage.setScene(s);
        stage.show();
        
    }


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
        System.out.println("Hello world!");
    }

}
