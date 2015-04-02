/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author danecek
 */
public class Scanners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("sometext.txt"));
//        for (String line = br.readLine(); line != null; line = br.readLine()) {
//            System.out.println(line);
//        }
//        tokenized(new FileReader("src/scanners/Scanners.java"));
        MyScanner ms = new MyScanner(new FileReader("sometext.txt"));//"src/scanners/Scanners.java"));
        for (MyToken mt = ms.next(); mt != null; mt = ms.next()) {
            System.out.println(mt);
        }
    }

    static void tokenized(Reader reader) {
        Scanner sc = new Scanner(reader);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }

}
