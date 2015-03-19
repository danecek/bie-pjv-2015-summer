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
public abstract class BopOper extends Expression {

    protected final Expression left;
    protected final Expression right;

    public BopOper(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * @return the left
     */
    public Expression getLeft() {
        return left;
    }

    /**
     * @return the right
     */
    public Expression getRight() {
        return right;
    }


}
