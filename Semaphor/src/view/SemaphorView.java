/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public class SemaphorView extends VBox {

    List<Light> lights = new ArrayList<>();

    public SemaphorView(int radius, Color... colors) {
        for (Color c : colors) {
            lights.add(new Light(c, radius));
        }
        getChildren().addAll(lights);
    }

    public void fireStateChanged(Controller controler) {
        Collection<Color> onColors = controler.getState().getOnColors();
        for (Light l : lights) {
            l.on.set(onColors.contains(l.color));
        }
    }

}
