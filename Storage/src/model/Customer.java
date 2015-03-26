/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author danecek
 */
public class Customer implements Serializable {

    @Override
    public String toString() {
        return "Customer{" + username + ", " + address + '}';
    }

    public Customer(String username, Address address) {
        this.username = username;
        this.address = address;
    }

    private final String username;
    private final Address address;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

}
