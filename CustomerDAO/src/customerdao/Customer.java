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
public class Customer {

    private final Name name;
    private Group group;

    public Customer(Name name, Group group) {
        this.name = name;
        this.group = group;
    }

    /**
     * @return the group
     */
    public Group getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + getName() + ", group=" + group + '}';
    }

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

}
