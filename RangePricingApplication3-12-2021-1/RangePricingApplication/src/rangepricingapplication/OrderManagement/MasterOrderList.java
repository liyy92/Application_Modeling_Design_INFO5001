/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.OrderManagement;

import java.util.ArrayList;
import rangepricingapplication.CustomerManagement.CustomerProfile;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.Personnel.Person;

/**
 *
 * @author kal bugrara
 */
public class MasterOrderList {
    ArrayList<Order> orders;
    public MasterOrderList(){
        orders = new ArrayList();
    }
    
    public Order newOrder(CustomerProfile cp, EmployeeProfile ep){
        Order o= new Order(cp, ep);
        orders.add(o);

        return o;
        
            
 
    }


    
}
