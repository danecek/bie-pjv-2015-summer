/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerdao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author danecek
 */
public class CustomerDAO {

    static final CustomerDAO instance = new CustomerDAO();

    private CustomerDAO() {
    }

    Map<Name, Customer> customers = new TreeMap<>();
    Map<Group, Set<Customer>> customersByGroup = new TreeMap<>();

    public void create(String f, String l, Group g) {
        Customer c = new Customer(new Name(f,l), g);
        customers.put(c.getName(), c);
        Set<Customer> custSet = customersByGroup.get(g);
        if (custSet == null) {
            custSet = new HashSet<>();
            customersByGroup.put(g, custSet);
        }
        custSet.add(c);
    }

    public Collection<Customer> all() {
        return customers.values();
    }

    public Customer find(String name) {
        return customers.get(name);
    }

    public Set<Customer> find(Group group) {
        return customersByGroup.get(group);
    }
}
