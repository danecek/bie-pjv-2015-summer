/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.io.FileNotFoundException;

/**
 *
 * @author danecek
 */
public class MySorageException extends Exception {

    /**
     * Creates a new instance of <code>MySorageException</code> without detail
     * message.
     */
    public MySorageException() {
    }

    /**
     * Constructs an instance of <code>MySorageException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MySorageException(String msg) {
        super(msg);
    }

    MySorageException(Throwable ex) {
        super(ex);
    }
}
