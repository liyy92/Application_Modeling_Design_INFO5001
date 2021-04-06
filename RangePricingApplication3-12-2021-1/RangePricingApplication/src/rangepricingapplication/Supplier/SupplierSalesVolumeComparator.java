/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import java.util.Comparator;
import rangepricingapplication.ProductManagement.ProductSummary;

/**
 *
 * @author reaso
 */
public class SupplierSalesVolumeComparator implements Comparator<Supplier> {

    @Override
    public int compare(Supplier p1, Supplier p2) {
        return (-1)*Integer.compare(p1.getSalesVolume(), p2.getSalesVolume()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
