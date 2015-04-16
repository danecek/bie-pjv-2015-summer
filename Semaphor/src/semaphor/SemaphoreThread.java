/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import semaphor.controller.Controller;

/**
 *
 * @author danecek
 */
public class SemaphoreThread extends Thread {

    private final Controller controller;
    AtomicBoolean runnig = new AtomicBoolean(true);

    public SemaphoreThread(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void run() {
        while (runnig.get()) {
            try {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        controller.next();
                    }
                });
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SemaphoreThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void myStop() {
        runnig.set(false);
        
    }

}
