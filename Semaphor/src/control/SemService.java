/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author danecek
 */
public class SemService extends Service {

    @Override
    protected Task createTask() {
        return null;
    }

    public SemService() {
   //     valueProperty().addListener(null);
    }
    
}
