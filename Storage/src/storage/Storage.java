/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author danecek
 */
public class Storage {

    public static Storage instance = new Storage();

    private Map<String, Customer> customers = new TreeMap<>();

    private Storage() {
    }

    public void insert(Customer c) throws MySorageException {
        if (customers.containsKey(c.getUsername())) {
            throw new MySorageException("duplicate username");
        }
        customers.put(c.getUsername(), c);
    }

    Collection<Customer> all() {
        return customers.values();
    }

    public void store() throws MySorageException {
        store("data.bin");
    }

    public void store(String file) throws MySorageException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(customers);
        } catch (IOException ex) {
            throw new MySorageException(ex);
        }
    }

    public void load() throws MySorageException {
        load("data.bin");
    }

    public void load(String file) throws MySorageException {
        try {
            FileInputStream data = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(data);
            customers = (Map<String, Customer>) ois.readObject();
        } catch (FileNotFoundException ex) {
            throw new MySorageException("the file data.bin is missing");
        } catch (IOException | ClassNotFoundException ex) {
            throw new MySorageException(ex);
        }
    }

}
