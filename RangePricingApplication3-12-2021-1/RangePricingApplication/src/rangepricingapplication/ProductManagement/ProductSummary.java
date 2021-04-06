/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.ProductManagement;

/**
 *
 * @author kal bugrara
 */
//this class will extract summary data from the product
public class ProductSummary {
    Product subjectproduct;
    int numberofsalesabovetarget;
    int numberofsalesbelowtarget;
    int salesvolume;
    int rank; // will be done later
    
    public ProductSummary(Product p){
        
        numberofsalesabovetarget = p.getNumberOfProductSalesAboveTarget();
        salesvolume = p.getNumberOfProductSalesVolumes();
        subjectproduct = p; //keeps track of the product itself not as well;
        
    }

    public Product getSubjectproduct() {
        return subjectproduct;
    }

    public int getNumberofsalesabovetarget() {
        return numberofsalesabovetarget;
    }

    public int getSalesvolume() {
        return salesvolume;
    }
    
    public int getNumberAboveTarget() {
        return numberofsalesabovetarget;
        
    }
    
}
