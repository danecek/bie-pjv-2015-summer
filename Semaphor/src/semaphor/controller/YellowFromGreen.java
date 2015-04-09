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
class YellowFromGreen extends State {

    static YellowFromGreen instance = new YellowFromGreen();

    public YellowFromGreen() {
        super(Color.YELLOW);
    }

    @Override
    public State getNextState() {
        return RedState.instance;
    }

}
