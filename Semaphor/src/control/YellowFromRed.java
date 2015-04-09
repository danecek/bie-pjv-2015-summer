/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Collection;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
class YellowFromRed extends State {

    private static YellowFromRed instance;

    public YellowFromRed() {
        super(GreenState.getInstance(), Color.RED, Color.YELLOW);
    }

    public static YellowFromRed getInstance() {
        if (instance == null) {
            instance = new YellowFromRed();
        }
        return instance;
    }
}
