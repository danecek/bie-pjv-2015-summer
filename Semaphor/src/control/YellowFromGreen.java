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
class YellowFromGreen extends State {

   private static YellowFromGreen instance;

    public YellowFromGreen() {
        super(RedState.getInstance(), Color.YELLOW);
    }
    
        public static YellowFromGreen getInstance() {
        if (instance == null) {
            instance = new YellowFromGreen();
        }
        return instance;
    }

}
