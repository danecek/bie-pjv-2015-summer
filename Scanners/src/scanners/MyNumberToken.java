/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template) in the editor.
 */
package scanners;

/**
 *
 * @author danecek
 */
public class MyNumberToken extends MyToken {

    int value;

    public MyNumberToken(int value) {
        super(Tokens.NUMBER);
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + value + "]";
    }

}
