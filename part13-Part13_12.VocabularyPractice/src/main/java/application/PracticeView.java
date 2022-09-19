package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
/**
 *
 * @author dsa21
 */
public class PracticeView {
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary d) {
        this.dictionary = d;
        this.word = d.getRandomWord();
    }
    
    public Parent getView() {
        
        GridPane gp = new GridPane();
        gp.setAlignment(Pos.CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(10,10,10,10));        
        
        Label pWord = new Label("Translate the word '" + this.word + "'.");
        TextField getTrans = new TextField();
        Button cWord = new Button("Check");
        Label result = new Label("");
        
        gp.add(pWord,0,0);
        gp.add(getTrans,0,1);
        gp.add(cWord,0,2);
        gp.add(result,0,3);
        
        cWord.setOnMouseClicked((event) -> {

            if(dictionary.get(this.word).equals(getTrans.getText())) {
                result.setText("Correct!");
                this.word = this.dictionary.getRandomWord();
                pWord.setText("Translate the word '" + this.word + "'.");
                getTrans.clear(); 
            }else {
                result.setText("Incorrect! the translation of the word '" + pWord.getText() + "' is: \n'" + dictionary.get(this.word) + "'.");
                getTrans.clear();                    
            }
        });
        
        return gp;
    }    
}
