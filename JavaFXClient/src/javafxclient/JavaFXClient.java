/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclient;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.concurrent.*;

/**
 *
 * @author danecek
 */
public class JavaFXClient extends Application {

    @Override
    public void start(Stage primaryStage) {

        Label output = new Label();
        Button btn = new Button();
        btn.setText("Current Time");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                ExecutorService es = Executors.newCachedThreadPool();
                Future<String> f = es.submit(new AskServerTask());
                try {
                    String ansver = f.get();
                    output.setText(ansver);
                } catch (InterruptedException ex) {
                    Logger.getLogger(JavaFXClient.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExecutionException ex) {
                    output.setText(ex.toString());
                }

            }
        });

        VBox root = new VBox();
        root.setSpacing(20);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(btn, output);

        Scene scene = new Scene(root);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    static int serverPort = 3333;

    public static void main(String[] args) {
        launch(args);
    }

}
