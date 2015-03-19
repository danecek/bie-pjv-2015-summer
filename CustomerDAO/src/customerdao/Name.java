/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerdao;

import java.util.Objects;

/**
 *
 * @author danecek
 */
public class Name implements Comparable<Name> {

    private final String f;
    private final String s;

    public Name(String f, String s) {
        this.f = f;
        this.s = s;
    }

    /**
     * @return the f
     */
    public String getF() {
        return f;
    }

    /**
     * @return the s
     */
    public String getS() {
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Name))return false;
        return compareTo((Name)obj) == 0;
    }

    @Override
    public int hashCode() {
        return  f.hashCode() + s.hashCode();
    }
    
    

    @Override
    public int compareTo(Name name) {
       int c = this.s.compareTo(name.s);
       if (c != 0) return c;
       return this.f.compareTo(name.f);
    }

    @Override
    public String toString() {
        return "[" + f + " "+  s + ']';
    }

}
