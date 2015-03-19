/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerdao;

/**
 *
 * @author danecek
 */
public class Main {
    public static void main(String[] args) {
        CustomerDAO.instance.create("Tom","Bok", Group.RED);
        CustomerDAO.instance.create("John", "Smith", Group.GREEN);
        CustomerDAO.instance.create("Ann", "Grange", Group.GREEN);
        System.out.println(CustomerDAO.instance.all());
        System.out.println(CustomerDAO.instance.find(Group.GREEN));
    }
    
}
