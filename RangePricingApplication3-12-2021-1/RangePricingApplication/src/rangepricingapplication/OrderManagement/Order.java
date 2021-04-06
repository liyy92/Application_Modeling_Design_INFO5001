/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.OrderManagement;

import java.util.ArrayList;
import rangepricingapplication.CustomerManagement.CustomerProfile;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.ProductManagement.Product;

/**
 *
 * @author kal bugrara
 */
public class Order {

    ArrayList<OrderItem> orderitems;
    CustomerProfile customer;
    EmployeeProfile employee;
    

    public Order(){}
    
    public Order(CustomerProfile cp, EmployeeProfile ep) {
        orderitems = new ArrayList();
        customer = cp;
        employee = ep;
        ep.addOrder(this);
    }

    public OrderItem newOrderItem(Product p, int actualPrice, int q) {
        OrderItem oi = new OrderItem(p, actualPrice, q);
        orderitems.add(oi);
        return oi;
    }

    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTotal();
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.calculatePricePerformance();     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    
    public int getVomule() {
        int sum = 0;
        for (OrderItem i : orderitems) {
            sum += i.getVomule();
        }
        return sum;
    }
    
    public String toString() {
        return "" + orderitems;
    }
    
   
}
