/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Address;
import model.Customer;

/**
 *
 * @author danecek
 */
public class Main {

    public static void main(String[] args) {
        try {
            Storage.instance.insert(new Customer("John", new Address("Pargue")));
            System.out.println(Storage.instance.all());
            Storage.instance.store();
            Storage.instance.insert(new Customer("Tom", new Address("Pargue")));
            System.out.println(Storage.instance.all());
            Storage.instance.load();
            System.out.println(Storage.instance.all());
        } catch (MySorageException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
