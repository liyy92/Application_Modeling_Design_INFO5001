/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.ProductManagement;

import java.util.ArrayList;
import java.util.Collections;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.ProductManagement.productSalesVolumeComparator;

/**
 *
 * @author kal bugrara
 */
public class ProductsReport {
 
    ArrayList<ProductSummary> productsummarylist;
    public ProductsReport(){
        productsummarylist = new ArrayList();
    }
    public void addProductSummary(ProductSummary ps){
        
    productsummarylist.add(ps);
    }

    public ArrayList<ProductSummary> getProductsummarylist() {
        return productsummarylist;
    }
    
    public ProductSummary getTopProductAboveTarget(){
        ProductSummary currenttopproduct = null;
        
        for (ProductSummary ps: productsummarylist){
            if(currenttopproduct == null)currenttopproduct = ps; // initial step 
            else 
                if(ps.getNumberAboveTarget()> currenttopproduct.getNumberAboveTarget()){
                currenttopproduct = ps; //we have a new higher total
            }
        
                }
        return currenttopproduct;
    }
    
    public ArrayList<ProductSummary> getTopTenSalesVolumes() {
        productSalesVolumeComparator productSvComparator = new productSalesVolumeComparator();
   
        
        Collections.sort(productsummarylist, productSvComparator);
        
        ArrayList<ProductSummary> rankForSalesVolumes = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            rankForSalesVolumes.add(productsummarylist.get(i));
            
        }
        return rankForSalesVolumes;
        

    }
    
    public ArrayList<ProductSummary> getTopTenPricePerformance() {
        ProductPricePerformanceComparator productPpComparator = new ProductPricePerformanceComparator();
   
        Collections.sort(productsummarylist, productPpComparator);
        
        ArrayList<ProductSummary> rank = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            rank.add(productsummarylist.get(i));
        }
        
        return rank;
    }
}
