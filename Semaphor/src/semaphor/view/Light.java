/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class Light extends StackPane {

    Color color;
    SimpleBooleanProperty on = new SimpleBooleanProperty(true);
    private final Circle circle;

    public Light(Color color, double radius) {
        this.color = color;
        getChildren().add(circle = new Circle(radius, color));
//        on.addListener(new ChangeListener<Boolean>() {
//
//            @Override
//            public void changed(ObservableValue<? extends Boolean> observable,
//                        Boolean oldValue, Boolean newValue) {
//                if (newValue)
//                  circle.setFill(color);
//                else 
//                    circle.setFill(Color.DARKGREY);
//            }
//            
//        });
        
//        on.addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) -> {
//            if (newValue) {
//                circle.setFill(color);
//            } else {
//                circle.setFill(Color.DARKGREY);
//            }
//        });
        on.addListener(new OnChangeHandler(circle, color));
    }

}
