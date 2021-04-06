/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Supplier;

import rangepricingapplication.ProductManagement.Product;
import rangepricingapplication.ProductManagement.ProductCatalog;

/**
 *
 * @author kal bugrara
 */
public class Supplier {
    String name;
    ProductCatalog productcatalog;
    public Supplier(String n){
        name = n;
        productcatalog = new ProductCatalog();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }
    
    public int getSalesVolume() {
        int sum = 0;
        for (Product p : productcatalog.getProducts()) {
            sum += p.getNumberOfProductSalesVolumes();
        }
        return sum;
    }
    
    
}
