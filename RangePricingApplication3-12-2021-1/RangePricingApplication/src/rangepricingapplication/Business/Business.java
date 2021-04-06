/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Business;

import rangepricingapplication.CustomerManagement.CustomerDirectory;
import rangepricingapplication.OrderManagement.MasterOrderList;
import rangepricingapplication.Personnel.EmployeeDirectory;
import rangepricingapplication.Supplier.SupplierDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {
    String name;
    MasterOrderList masterOrderList;
    SupplierDirectory supplierDirectory;
    EmployeeDirectory employeeDirectory;
    CustomerDirectory customerDirectory;

    public Business(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    
    
}
