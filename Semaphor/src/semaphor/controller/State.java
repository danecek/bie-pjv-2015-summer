/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.controller;

import java.util.Arrays;
import java.util.Collection;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public abstract class State {

    private final Collection<Color> onColors;

    public State(Color... onColors) {
        this.onColors = Arrays.asList(onColors);
    }

    void leave(Controller controller) {
        controller.setState(getNextState());
    }

    void enter() {
    }

    public Collection<Color> getOnColors() {
        return onColors;
    }


    public abstract State getNextState();
}
