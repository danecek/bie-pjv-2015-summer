/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public class GreenState extends State {

    private static GreenState instance;

    public GreenState() {
        super(null, Color.GREEN);
    }

    public static GreenState getInstance() {
        if (instance == null) {
            instance = new GreenState();
        }
        if (instance.nextState == null)
            instance.nextState = YellowFromGreen.getInstance();
        return instance;
    }

}
