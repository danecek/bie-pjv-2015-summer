/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

/**
 *
 * @author danecek
 */
class MyToken {

    Tokens tokenClass;

    public MyToken(Tokens tokenClass) {
        this.tokenClass = tokenClass;
    }

    @Override
    public String toString() {
        return tokenClass.toString();
    }

}
