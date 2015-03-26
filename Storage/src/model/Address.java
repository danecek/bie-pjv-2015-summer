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
public class Address implements Serializable {

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  "[" + city + ']';
    }

    private final String city;

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

}
