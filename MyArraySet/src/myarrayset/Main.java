/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarrayset;

/**
 *
 * @author danecek
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArraySet mas = new MyArraySet(100);
        System.out.println(mas.size());
        mas.add("ABC");
        System.out.println(mas.size());
        mas.add("ABC");
        System.out.println(mas.size());
        // TODO code application logic here
    }
}
