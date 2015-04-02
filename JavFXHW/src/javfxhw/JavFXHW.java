/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javfxhw;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class JavFXHW extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label buttLabel = new Label("Say 'Hello World'");
        Button btn = new Button("Click");
        HBox labeledButtonBox = new HBox(buttLabel, btn);
        EventHandler<ActionEvent> eh = new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        };
            
        btn.setOnAction(eh);

        StackPane root = new StackPane();
        root.getChildren().add(labeledButtonBox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
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
