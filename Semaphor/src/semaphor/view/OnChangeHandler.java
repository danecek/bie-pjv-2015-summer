/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author danecek
 */
public class OnChangeHandler implements ChangeListener<Boolean> {

    Color color;
    Circle circle;
    
    public OnChangeHandler(Circle circle, Color color) {
        this.circle = circle;
        this.color = color;
    }


    @Override
    public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        if (newValue) {
            circle.setFill(color);
        } else {
            circle.setFill(Color.DARKSLATEGRAY);
        }
    }

}
