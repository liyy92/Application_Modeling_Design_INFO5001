/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import java.util.ArrayList;
import java.util.Collections;
import rangepricingapplication.ProductManagement.ProductPricePerformanceComparator;
import rangepricingapplication.ProductManagement.productSalesVolumeComparator;

/**
 *
 * @author reaso
 */
public class SupplierReport {
 
    ArrayList<Supplier> supplierlist;
    public SupplierReport(ArrayList<Supplier> supplierlist){
        this.supplierlist = supplierlist;
    }
    public void addSupplier(Supplier ps){
        
    supplierlist.add(ps);
    }

    public ArrayList<Supplier> getsupplierlist() {
        return supplierlist;
    }
    
    
    public ArrayList<Supplier> getTopTenSalesVolumes() {
        SupplierSalesVolumeComparator supplierSvComparator = new SupplierSalesVolumeComparator();
   
        
        Collections.sort(supplierlist, supplierSvComparator);
        
        ArrayList<Supplier> rankForSalesVolumes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rankForSalesVolumes.add(supplierlist.get(i));
            
        }
        return rankForSalesVolumes;
        

    }
}
