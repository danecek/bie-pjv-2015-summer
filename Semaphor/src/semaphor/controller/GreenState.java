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
public class GreenState extends State {

    static GreenState instance = new GreenState();

    public GreenState() {
        super(Color.GREEN);
    }

    @Override
    public State getNextState() {
        return YellowFromGreen.instance;
    }

}
