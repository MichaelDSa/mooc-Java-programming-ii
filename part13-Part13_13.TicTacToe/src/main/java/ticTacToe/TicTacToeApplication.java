package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {
    // I'll use an array of nine alternating X's and O's. 
    // I'll use a counter to keep track of the index. 
    // Each successive string index will be set as the text 
    // of each clicked button.    
    private int count;        
    private String[] xo;
    // the Label and Button are initialized in the constructor, 
    // because they need to be effectively final to work with the Event Handling lambda
    private Label info;
    private Button[][] bArray;
    
    public TicTacToeApplication() {
        // the counter will also maintain alternation of the label contents.
        this.info = new Label(count % 2 == 0? "Turn: X" : "Turn: O");
        // a button array resembling the grid layout:
        this.bArray = new Button[3][3];
        this.count = 0;        
        this.xo = new String[9];
        // initialize the String array as alternating X's & O's
        for(int i = 0; i < xo.length; i++) {
            this.xo[i] = i % 2 == 0 ? "X" : "O";
            // use the loop same loop to initialize the buttons:
            if(i < 3) {
                for(int j = 0; j < bArray[i].length && i < 3; j++) {
                    // the button() method will initialize each element, 
                    // and provide an event handler for each one.
                    this.bArray[i][j] = button();
                }
            }            
        }       
    }
    // set up the panes:
    @Override
    public void start(Stage window) {
        BorderPane bp = new BorderPane();
        info.setFont(Font.font("Monospaced",44));
        
        GridPane gp = new GridPane();        
        for(int i = 0; i < bArray.length; i++) {
            for(int j = 0; j < bArray[i].length; j++) {   
                bArray[i][j] = button();
                gp.add(bArray[i][j],i,j);
            }            
        }
        
        gp.setAlignment(Pos.BOTTOM_CENTER);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setPadding(new Insets(10,10,10,10));          
        
        bp.setTop(info);
        bp.setCenter(gp);
        
        Scene view = new Scene(bp,300,330);
        window.setScene(view);
        window.show();        
    }      
    
    public Button button() {
        
        Button b = new Button(" ");
        b.setFont(Font.font("Monospaced",44));
        
        b.setOnAction((event) -> {
            // you can click only if the button is empty.
            if(b.getText().equals(" ")) {  
                // set text to either X or O using the xo array and the count.
                b.setText(xo[count]);                
                count++;                
                //the gameOver() method returns true if someone has one, but does not say who the winner is.
                if(gameOver(this.bArray)) {
                    // I prefer "Game Over!" because nostalgia.
                    this.info.setText("The end!");
                } else {
                    this.info.setText(count % 2 == 0? "Turn: X" : "Turn: O");
                }
            }
        });    
        
        return b;
    }
    
    public Boolean gameOver(Button[][] b) {
        // if noone has won, and the game is scratch:
        if(count >= 9) {
            return true;
        }
        // good excuse to practice using Stringbuilder and Regular expressions.
        // three concatenated X's or O's returns true.
        Boolean gameIsOver = false;
        StringBuilder vertical = new StringBuilder();
        StringBuilder horizontal = new StringBuilder();
        StringBuilder rightDiagonal = new StringBuilder();
        StringBuilder leftDiagonal = new StringBuilder();
        
        for(int i = 0; i < b.length; i++) {
            int k = 2;
            for(int j = 0; j < b[i].length; j++) {
                vertical.append(b[i][j].getText());
                horizontal.append(b[j][i].getText());
                rightDiagonal.append(b[j][j].getText());
                leftDiagonal.append(b[j][k].getText());
                k--;
                 
                if(vertical.toString().matches("XXX|OOO")
                        || horizontal.toString().matches("XXX|OOO")
                        || rightDiagonal.toString().matches("XXX|OOO")
                        || leftDiagonal.toString().matches("XXX|OOO")) {
                    gameIsOver = true;
                    break;
                }
                if(vertical.length() >= 3) {
                    vertical.delete(0,vertical.length());
                }
                if(horizontal.length() >= 3) {
                    horizontal.delete(0,horizontal.length());
                }
                if(rightDiagonal.length() >= 3) {
                    rightDiagonal.delete(0,rightDiagonal.length());
                }
                if(leftDiagonal.length() >= 3) {
                    leftDiagonal.delete(0,leftDiagonal.length());
                }                
            }
        }
        return gameIsOver;
        
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
        System.out.println("Hello world!");
    }

}
