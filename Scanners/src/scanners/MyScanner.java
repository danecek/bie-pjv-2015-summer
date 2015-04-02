/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author danecek
 */
public class MyScanner {

    Reader src;
    private char currentChar;

    public MyScanner(Reader src) throws IOException {
        this.src = src;
        skip();
    }

    MyToken next() throws IOException {
        skipWhites();
        if (Character.isJavaIdentifierStart(currentChar)) {
            return identToken();
        }
        if (Character.isDigit(currentChar)) {
            return numberToken();
        }
        switch (currentChar) {
            case '(': {
                skip();
                return new MyToken(Tokens.LPAR);
            }
            default: new IOException("invalid character");
        }
        return null;
    }

    private void skipWhites() throws IOException {
        while (Character.isWhitespace(currentChar)) {
            skip();
        }
    }

    private void skip() throws IOException {
        int c = src.read();
        if (c == -1) {
            currentChar = 0;
        }
        currentChar = (char) c;
    }

    private MyToken identToken() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (Character.isJavaIdentifierPart(currentChar)) {
            sb.append(currentChar);
            skip();
        }
        return new MyIdentToken(sb.toString());
    }

    private MyToken numberToken() throws IOException {
        int value = 0;
        while (Character.isDigit(currentChar)) {
            value = value * 10 + (currentChar - '0');
            skip();
        }
        return new MyNumberToken(value);
    }

}
