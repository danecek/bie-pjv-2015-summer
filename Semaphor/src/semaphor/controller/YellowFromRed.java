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
class YellowFromRed extends State {

    static YellowFromRed instance = new YellowFromRed();

    public YellowFromRed() {
        super(Color.RED, Color.YELLOW);
    }

    @Override
    public State getNextState() {
        return GreenState.instance;
    }
}
