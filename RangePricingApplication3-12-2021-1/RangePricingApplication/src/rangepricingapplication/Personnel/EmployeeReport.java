/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Personnel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.ProductManagement.ProductPricePerformanceComparator;
import rangepricingapplication.ProductManagement.ProductSummary;
import rangepricingapplication.ProductManagement.productSalesVolumeComparator;

/**
 *
 * @author reaso
 */
public class EmployeeReport {
    
    ArrayList<EmployeeProfile> employeeSaleProductList;

    public EmployeeReport() {
        employeeSaleProductList = new ArrayList<EmployeeProfile>(); ;
    }
    
    public void addEmployeeProfile(EmployeeProfile ep){
        
        employeeSaleProductList.add(ep);
    }

    public ArrayList<EmployeeProfile> getEmployeeSaleProductList() {
        return employeeSaleProductList;
    }
   
    
    
    
    public ArrayList<EmployeeProfile> getTopTenSalesVolumesForEmployee() {
        
        EmployeeSalesVolumeComparator employeeSvComparator = new EmployeeSalesVolumeComparator();
   
        
        Collections.sort(employeeSaleProductList, employeeSvComparator);
        
        ArrayList<EmployeeProfile> rankForSalesVolumes = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            rankForSalesVolumes.add(employeeSaleProductList.get(i));
            
        }
        return rankForSalesVolumes;
    }
    
    public ArrayList<EmployeeProfile> getTopTenPricePerformanceForEmployee() {
        EmployeePricePerformanceComparator employeePpComparator = new EmployeePricePerformanceComparator();
   
        Collections.sort(employeeSaleProductList, employeePpComparator);
        
        ArrayList<EmployeeProfile> rank = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            rank.add(employeeSaleProductList.get(i));
        }
        
        return rank;
        
   
        
        

    }
            
    
}
    
    