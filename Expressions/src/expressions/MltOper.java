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
public class MltOper extends BopOper {

    public MltOper(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    int eval() {
        return getLeft().eval() * getRight().eval();
    }

    @Override
    public String toString() {
       return "(" + left.toString() + '*' + right + ")";
    }
    

}
