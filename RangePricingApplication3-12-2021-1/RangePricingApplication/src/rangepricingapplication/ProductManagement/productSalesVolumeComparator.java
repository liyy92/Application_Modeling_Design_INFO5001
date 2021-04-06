/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.ProductManagement;

import java.util.Comparator;

/**
 *
 * @author reaso
 */
public class productSalesVolumeComparator implements Comparator<ProductSummary>{

    @Override
    public int compare(ProductSummary ps1, ProductSummary ps2) {
        
        return (-1)*Integer.compare(ps1.getSalesvolume(), ps2.getSalesvolume());//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
