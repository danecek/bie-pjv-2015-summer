/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import semaphor.controller.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphor.view.SemaphorView;

/**
 *
 * @author danecek
 */
public class Semaphor extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(20);
        SemaphorView sv = new SemaphorView(20, Color.RED, Color.YELLOW, Color.GREEN);
        Controller c = new Controller(sv);
        btn.setText("Next");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                c.next();
            }
        });

        root.getChildren().addAll(sv, btn);
        
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("Semaphor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
