/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressions;

/**
 *
 * @author danecek
 */
public class Number extends Expression {
    
    private final int value;

    public Number(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + "";
    } 

    @Override
    int eval() {
        return value;
    }
    
    

    
}
