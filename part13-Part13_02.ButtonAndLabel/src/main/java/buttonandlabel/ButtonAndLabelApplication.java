package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {
    
@Override
public void start(Stage window) {
    Button button = new Button("The button");
    Label text = new Label("this is the label");
    
    FlowPane component = new FlowPane();
    component.getChildren().add(text);
    component.getChildren().add(button);
        
    Scene view = new Scene(component);
    
    window.setScene(view);
    window.show();
}


    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
