/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import semaphor.controller.Controller;

/**
 *
 * @author danecek
 */
public class SemaphorThread extends Thread {

    Controller c;

    public SemaphorThread(Controller c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            for (;;) {
                sleep(1000);
                Platform.runLater(new Runnable() {

                    @Override
                    public void run() {
                       c.next();
                    }
                });
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(SemaphorThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
