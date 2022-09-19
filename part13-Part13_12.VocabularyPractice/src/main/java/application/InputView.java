package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
/**
 *
 * @author dsa21
 */
public class InputView {
    
    Dictionary dictionary;
    
    public InputView(Dictionary d) {
        this.dictionary = d;
    }
    
    public Parent getView() {
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(10,10,10,10));
        
        Label word = new Label("Word");
        TextField  enterWord = new TextField();
        Label trans = new Label("Translation");
        TextField enterTrans = new TextField();
        Button add = new Button("Add the word pair");        
        
        gp.add(word, 0, 0);
        gp.add(enterWord,0,1);
        gp.add(trans,0,2);
        gp.add(enterTrans,0,3);
        gp.add(add,0,4);
        
        add.setOnMouseClicked((event) -> {            
            this.dictionary.add(enterWord.getText(), enterTrans.getText());
            enterWord.clear();
            enterTrans.clear();
        });
        return gp;                
    }
    
}
