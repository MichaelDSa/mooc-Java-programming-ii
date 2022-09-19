package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 *
 * @author dsa21
 */
public class PracticeApplication extends Application {
    
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception {
        this.dictionary = new Dictionary();
    }
    
    @Override
    public void start(Stage window) {
        PracticeView pv = new PracticeView(dictionary);
        InputView iv = new InputView(dictionary);
        
        BorderPane bp = new BorderPane();
        HBox menu = new HBox();
        menu.setPadding(new Insets(10,10,10,10));
        menu.setSpacing(10);
        
        Button newWords = new Button("Enter new words");
        Button practice = new Button("Practice");
        
        menu.getChildren().addAll(newWords, practice);
        bp.setTop(menu);
        
        practice.setOnAction((event) -> bp.setCenter(pv.getView()));
        newWords.setOnAction((event) -> bp.setCenter(iv.getView()));
        
        bp.setCenter(iv.getView());
        
        Scene scene = new Scene(bp, 400,400);
        
        window.setScene(scene);
        window.show();        
    }
    
    public void launch() {
        launch(PracticeApplication.class);
    }
    
    
}
