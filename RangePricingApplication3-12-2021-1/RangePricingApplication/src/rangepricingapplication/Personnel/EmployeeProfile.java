/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Personnel;

import java.util.ArrayList;
import rangepricingapplication.OrderManagement.Order;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile {

    Person person;
    ArrayList<Order> employeeSalesOrder;
    
    
    public EmployeeProfile(Person p) {

        person = p;
        employeeSalesOrder = new ArrayList<Order>();
    }
    
    public void addOrder(Order o) {
        employeeSalesOrder.add(o);
        
    
    }
    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    public EmployeeReport newEmployeeReport () {
        EmployeeReport er = new EmployeeReport();
        return er;
        
    }
    
    public int getSalesVolumeForEmployee() {
        int sum = 0;
        
        for (Order i : employeeSalesOrder) {
            sum += i.getVomule();
            
        }
        return sum;
    }
    
     public int getPricePerformanceEmployee() {
        int sum = 0;
        
        for (Order i : employeeSalesOrder) {
            sum += i.getOrderPricePerformance();
            
        }
        return sum;
    }

    public Person getPerson() {
        return person;
    }
    
   



}
