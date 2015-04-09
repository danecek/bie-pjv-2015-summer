/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.controller;

import semaphor.view.SemaphorView;

/**
 *
 * @author danecek
 */
public class Controller {

    private State currentState = RedState.instance;
    private SemaphorView sv;

    public Controller(SemaphorView sv) {
        this.sv = sv;
    }

    public void next() {
        currentState.leave(this);
        sv.fireStateChanged(this);
    }

    void setState(State nextState) {
        this.currentState = nextState;
    }

    /**
     * @return the state
     */
    public State getState() {
        return currentState;
    }
}
