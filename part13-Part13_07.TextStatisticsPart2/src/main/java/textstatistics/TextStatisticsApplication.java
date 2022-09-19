package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
        TextArea textArea = new TextArea();
        Label letters = new Label();
        Label words = new Label();
        Label longest = new Label();
        
        HBox hbox = new HBox();
        hbox.setSpacing(10);
        hbox.getChildren().add(letters);
        hbox.getChildren().add(words);
        hbox.getChildren().add(longest);
        
        bp.setBottom(hbox);
        bp.setCenter(textArea);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
                int characters = newValue.length();
                String[] parts = newValue.split(" ");
                int numberOfWords = parts.length;
                String longestWord = Arrays.stream(parts)
                        .sorted((s1,s2)-> s2.length() - s1.length())
                        .findFirst()
                        .get();
                
                letters.setText("Letters: " + characters);
                words.setText("Words: " + numberOfWords);
                longest.setText("The longest word is: " + longestWord);
        });
            
        
        
    
        
        
        Scene scene = new Scene(bp);
        
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}