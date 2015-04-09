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
public class RedState extends State {

    private static RedState instance;

    public RedState() {
        super(YellowFromRed.getInstance(), Color.RED);
    }

    public static RedState getInstance() {
        if (instance == null) {
            instance = new RedState();
        }
        return instance;
    }

}
