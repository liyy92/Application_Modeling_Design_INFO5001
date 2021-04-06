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
public class ProductPricePerformanceComparator implements Comparator<ProductSummary> {

    @Override
    public int compare(ProductSummary p1, ProductSummary p2) {
        return (-1)*Integer.compare(p1.getSubjectproduct().getOrderPricePerformance(), p2.getSubjectproduct().getOrderPricePerformance()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
