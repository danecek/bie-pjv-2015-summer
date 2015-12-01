/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

public class MyIdentToken extends MyToken {

    String id;

    public MyIdentToken(String id) {
        super(Tokens.IDENT);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + id + "]";
    }

}
