/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangles;

/**
 *
 * @author danecek
 */
public class Rectangles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle(1,1, 3);
        System.out.println(s1);
        Rectangle s2 = new Rectangle(3,3, 3);
        System.out.println(s2);
        System.out.println(s1.union(s2));
        // TODO code application logic here
    }
    
}
