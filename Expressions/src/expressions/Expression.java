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
public abstract class Expression {
    
    public static final Number ONE = new Number(1);
    public static final Number TWO = new Number(2);
    
    abstract int eval();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Expression ex = new PlusOperation(new Number(2), new Number(4));
        System.out.println(ex.eval());
        ex = new Number(3);
        System.out.println(ex.eval());
        ex = new MltOper(new PlusOperation(ONE, TWO),
                new Number(3));
        System.out.println(ex.eval());
        System.out.println(ex);
        // TODO code application logic here
    }
    
}
