/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Arrays;
import java.util.Collection;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public abstract class State {

    private final Collection<Color> onColors;
     State nextState;

    public State(State nextState, Color... onColors) {
        this.onColors = Arrays.asList(onColors);
        this.nextState = nextState;
    }
    


    void leave(Controller controller) {
        controller.setState(nextState);
    }

    void enter() {

    }

    /**
     * @return the onColors
     */
    public Collection<Color> getOnColors() {
        return onColors;
    }
}
