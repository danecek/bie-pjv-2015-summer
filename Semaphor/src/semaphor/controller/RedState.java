/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.controller;

import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public class RedState extends State {

    static RedState instance = new RedState();

    public RedState() {
        super(Color.RED);
    }

    @Override
    public State getNextState() {
        return YellowFromRed.instance;
    }

}
