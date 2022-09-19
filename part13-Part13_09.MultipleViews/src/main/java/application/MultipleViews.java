package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MultipleViews extends Application {
    
      @Override
  public void start(Stage window) {
      
      BorderPane bp = new BorderPane();
      Button toSecond = new Button("To the second view!");
      bp.setTop(new Label("First view!"));
      bp.setCenter(toSecond);
      Scene first = new Scene(bp,300,300);
      
      VBox vb = new VBox();
      Button toThird = new Button("To the third view!");
      vb.setSpacing(0);
      vb.getChildren().add(toThird);
      vb.getChildren().add(new Label("Second view!"));
      Scene second = new Scene(vb,300,300);   
      
      GridPane gp = new GridPane();      
      Button toFirst = new Button("To the first view!");
      gp.add(new Label("Third view!"),0,0);
      gp.add(toFirst,1,1);      
      Scene third = new Scene(gp,300,300);

      toSecond.setOnAction((event) -> {
          window.setScene(second);
      });

      toThird.setOnAction((event) -> {
          window.setScene(third);
      });
      
      toFirst.setOnAction((event) -> {
          window.setScene(first);
      });

      window.setScene(first);
      window.show();
  }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
