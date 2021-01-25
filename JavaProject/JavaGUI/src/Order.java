
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifaldzi
 */
public class Order implements Serializable{
    private Customer customer;
    private Menu[] menus;
    private int total;
    
    public Order(Customer customer, Menu[] menus, int total){
        this.customer = customer;
        this.menus = menus;
        this.total = total;
    }
    
    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the menus
     */
    public Menu[] getMenus() {
        return menus;
    }

    /**
     * @param menus the menus to set
     */
    public void setMenus(Menu[] menus) {
        this.menus = menus;
    }
    
    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
}
