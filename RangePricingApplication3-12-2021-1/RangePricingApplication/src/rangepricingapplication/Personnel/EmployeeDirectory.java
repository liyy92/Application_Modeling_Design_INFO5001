/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Personnel;

import java.util.ArrayList;
import rangepricingapplication.Business.*;
import rangepricingapplication.ProductManagement.Product;
import rangepricingapplication.ProductManagement.ProductSummary;
import rangepricingapplication.ProductManagement.ProductsReport;

/**
 *
 * @author kal bugrara
 */
public class EmployeeDirectory {

    Business business;
    ArrayList<EmployeeProfile> employeelist;

    public EmployeeDirectory(Business d) {

        business = d;
        employeelist = new ArrayList();

    }

    public EmployeeProfile newEmployeeProfile(Person p) {

        EmployeeProfile sp = new EmployeeProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public EmployeeProfile findEmployee(String id) {

        for (EmployeeProfile sp : employeelist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public EmployeeReport generatEmployeeReport(){
        EmployeeReport employeeSalesProductsReport = new EmployeeReport();
        
        for(EmployeeProfile ep : employeelist){
            
            employeeSalesProductsReport.addEmployeeProfile(ep);
            
        }
        return employeeSalesProductsReport; 
    }  
}
