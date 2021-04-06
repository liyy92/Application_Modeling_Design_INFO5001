/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.sort;
import rangepricingapplication.Business.Business;
import rangepricingapplication.CustomerManagement.CustomerDirectory;
import rangepricingapplication.CustomerManagement.CustomerProfile;
import rangepricingapplication.OrderManagement.MasterOrderList;
import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;
import rangepricingapplication.Personnel.EmployeeDirectory;
import rangepricingapplication.Personnel.EmployeeProfile;
import rangepricingapplication.Personnel.EmployeeReport;
import rangepricingapplication.Personnel.Person;
import rangepricingapplication.Personnel.PersonDirectory;
import rangepricingapplication.ProductManagement.Product;
import rangepricingapplication.ProductManagement.ProductCatalog;
import rangepricingapplication.ProductManagement.ProductSummary;
import rangepricingapplication.ProductManagement.ProductsReport;
import rangepricingapplication.Supplier.Supplier;
import rangepricingapplication.Supplier.SupplierDirectory;
import rangepricingapplication.Supplier.SupplierReport;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creat supplier named "San Jose Auto Concepts", its prodcutCatalog is car, add 15 cars in productcatelog. 
        SupplierDirectory sd = new SupplierDirectory();
        Supplier supplier1 = sd.newSupplier("supplier1");
        ProductCatalog car = new ProductCatalog("Car");
        supplier1.setProductcatalog(car);
        Product car1 = car.newProduct("car1", 14326, 61914  , 37617 );
        Product car2 = car.newProduct("car2", 12846 , 71714   , 44163);
        Product car3 = car.newProduct("car3", 10287 , 71714 , 46171);
        Product car4 = car.newProduct("car4", 11398 , 87475  , 46752 );
        Product car5 = car.newProduct("car5", 11514 , 66645  , 40923 );
        Product car6 = car.newProduct("car6", 13123 , 78440  , 43702 );
        Product car7 = car.newProduct("car7", 14697 , 64132  , 36387 );
        Product car8 = car.newProduct("car8", 13354 , 64822  , 30781);
        Product car9 = car.newProduct("car9", 12992 , 74636  , 53416 );
        Product car10 = car.newProduct("car10", 14377  , 86690 , 25799 );
        Product car11 = car.newProduct("car11", 11717 , 60434, 35504 );
        Product car12 = car.newProduct("car12", 11299 , 80847 , 45634 );
        Product car13 = car.newProduct("car13", 13119 , 63655 , 17228 );;
        Product car14 = car.newProduct("car14", 13811, 63808, 28779 );
        Product car15 = car.newProduct("car15", 14377 , 76043, 37596 );
        
        //Create PersonDiretory for person and add 5 persons for employee and 5 persons for customer.
        PersonDirectory pd = new PersonDirectory();
        Business carBusiness = new Business("Car Business");
        MasterOrderList mol = new MasterOrderList();
        carBusiness.setSupplierDirectory(sd);
        
        
        // employee id start with 00X
        Person emp001 = pd.newPerson("001");
        Person emp002 = pd.newPerson("002");
        Person emp003 = pd.newPerson("003");
        Person emp004 = pd.newPerson("004");
        Person emp005 = pd.newPerson("005");
        Person emp006 = pd.newPerson("006");
        Person emp007 = pd.newPerson("007");
        Person emp008 = pd.newPerson("008");
        Person emp009 = pd.newPerson("009");
        Person emp010 = pd.newPerson("010");
        Person emp011 = pd.newPerson("011");
        Person emp012 = pd.newPerson("012");
        Person emp013 = pd.newPerson("013");
                // customer id start with 55X
        Person cus551 = pd.newPerson("551");
        Person cus552 = pd.newPerson("552");
        Person cus553 = pd.newPerson("553");
        Person cus554 = pd.newPerson("554");
        Person cus555 = pd.newPerson("555");
        Person cus556 = pd.newPerson("556");
        Person cus557 = pd.newPerson("557");
        
        // add person in EmployeeDirectory and EmployeeProfile
        EmployeeDirectory ed = new EmployeeDirectory(carBusiness);
        EmployeeProfile emplpyee001 = ed.newEmployeeProfile(emp001);
        EmployeeProfile emplpyee002 =  ed.newEmployeeProfile(emp002);
        EmployeeProfile emplpyee003 =  ed.newEmployeeProfile(emp003);
        EmployeeProfile emplpyee004 =  ed.newEmployeeProfile(emp004);
        EmployeeProfile emplpyee005 =  ed.newEmployeeProfile(emp005);
        EmployeeProfile emplpyee006 = ed.newEmployeeProfile(emp006);
        EmployeeProfile emplpyee007 =  ed.newEmployeeProfile(emp007);
        EmployeeProfile emplpyee008 =  ed.newEmployeeProfile(emp008);
        EmployeeProfile emplpyee009 =  ed.newEmployeeProfile(emp009);
        EmployeeProfile emplpyee010 =  ed.newEmployeeProfile(emp010);
        EmployeeProfile emplpyee011 =  ed.newEmployeeProfile(emp011);
        EmployeeProfile emplpyee012 =  ed.newEmployeeProfile(emp012);
        EmployeeProfile emplpyee013 =  ed.newEmployeeProfile(emp013);
        

        // add person in CustomerDirectory and CustomerProfile
        CustomerDirectory cd = new CustomerDirectory(carBusiness);
        CustomerProfile customer551 = cd.newCustomerProfile(cus551);
        CustomerProfile customer552 = cd.newCustomerProfile(cus552);
        CustomerProfile customer553 = cd.newCustomerProfile(cus553);
        CustomerProfile customer554 = cd.newCustomerProfile(cus554);
        CustomerProfile customer555 = cd.newCustomerProfile(cus555);
        CustomerProfile customer556 = cd.newCustomerProfile(cus556);
        CustomerProfile customer557 = cd.newCustomerProfile(cus557);
        
        // create MasterOrderList for customer551, and this customer's order and order items
        carBusiness.setMasterOrderList(mol);
        Order order1  = mol.newOrder(customer551, emplpyee001);
        OrderItem io1 = order1.newOrderItem(car1, 45000, 2);
        OrderItem io2 = order1.newOrderItem(car2, 53153, 1);
        OrderItem io3 = order1.newOrderItem(car3, 47000, 1);
        
        // create MasterOrderList for customer552, and this customer's order and order items
        Order order2  = mol.newOrder(customer552, emplpyee002);
        OrderItem io4 = order2.newOrderItem(car4, 53153, 1);
        OrderItem io5 = order2.newOrderItem(car5, 47000, 1);
        OrderItem io6 = order2.newOrderItem(car6, 47000, 1);
        
        // create MasterOrderList for customer553, and this customer's order and order items
        Order order3  = mol.newOrder(customer553, emplpyee003);
        OrderItem io7 = order3.newOrderItem(car7, 62415, 2);
        OrderItem io8 = order3.newOrderItem(car8,54010, 1);
        OrderItem io9 = order3.newOrderItem(car9,54010, 1);
        
        // create MasterOrderList for customer554, and this customer's order and order items
        Order order4  = mol.newOrder(customer554, emplpyee004);
        OrderItem io10 = order4.newOrderItem(car10, 45217, 2);
        OrderItem io11 = order4.newOrderItem(car11, 22565, 1);
        OrderItem io12 = order4.newOrderItem(car12, 45217, 2);
        
        // create MasterOrderList for customer555, and this customer's order and order items
        Order order5  = mol.newOrder(customer555, emplpyee005);
        OrderItem io13 = order5.newOrderItem(car13, 45361, 1);
        OrderItem io14 = order5.newOrderItem(car14, 56216, 1);
        OrderItem io15 = order5.newOrderItem(car15, 56216, 1);
        
        // create MasterOrderList for customer556, and this customer's order and order items
        Order order6  = mol.newOrder(customer556, emplpyee005);
        OrderItem io16 = order6.newOrderItem(car5, 45361, 1);
        OrderItem io17 = order6.newOrderItem(car7, 44613, 1);
        OrderItem io18 = order6.newOrderItem(car11, 56222, 1);
        
        // create MasterOrderList for customer557, and this customer's order and order items
        Order order7  = mol.newOrder(customer557, emplpyee005);
        OrderItem io19 = order7.newOrderItem(car13, 45000, 1);
        OrderItem io20 = order7.newOrderItem(car14, 58000, 2);
        OrderItem io21 = order7.newOrderItem(car15, 55600, 1);
        
         Order order8  = mol.newOrder(customer551, emplpyee008);
        OrderItem io22 = order8.newOrderItem(car1, 45000, 2);
        
        // create MasterOrderList for customer552, and this customer's order and order items
        Order order9  = mol.newOrder(customer552, emplpyee009);
        OrderItem io23 = order9.newOrderItem(car4, 53153, 1);

        
        // create MasterOrderList for customer553, and this customer's order and order items
        Order order10  = mol.newOrder(customer553, emplpyee010);
        OrderItem io24 = order10.newOrderItem(car7, 62415, 2);

        
        // create MasterOrderList for customer554, and this customer's order and order items
        Order order11  = mol.newOrder(customer554, emplpyee011);
        OrderItem io25 = order11.newOrderItem(car10, 45217, 2);

        
        // create MasterOrderList for customer555, and this customer's order and order items
        Order order12  = mol.newOrder(customer555, emplpyee012);
        OrderItem io26 = order12.newOrderItem(car13, 45361, 1);

        
        // create MasterOrderList for customer556, and this customer's order and order items
        Order order13  = mol.newOrder(customer556, emplpyee013);
        OrderItem io27 = order13.newOrderItem(car5, 45361, 1);

        

        
       
        // Part1--- Generate two reports with 10 best performing products
        System.out.println("************Part1: Generate two reports with 10 best performing products************" );
        System.out.println();
        System.out.println("-------Report 1: Top 10 best performing products by sales volume--------------" );
        
        // Create carProductReport and use getToptenSales volumes method.
        ProductsReport caProductReport = car.generatPerformanceReport();
        ArrayList<ProductSummary> top10SalesVolumeProductReport = caProductReport.getTopTenSalesVolumes();
        
        
        for (int i = 0; i <= top10SalesVolumeProductReport.size(); i++) {
                
                System.out.println("#" + (i + 1) + ": " +  caProductReport.getProductsummarylist().get(i).getSubjectproduct().getName() + ", " +
                                    " sales volume " + caProductReport.getProductsummarylist().get(i).getSalesvolume());
        }    
            
        System.out.println();
        
        System.out.println("-------Report 2: Top 10 best performing products by price performance--------------" );
        
        ArrayList<ProductSummary> top10PricePerformance = caProductReport.getTopTenPricePerformance();
       
        
        for (int i = 0; i < top10PricePerformance.size(); i++) {
           
                
                System.out.println("#" + (i + 1) + ": " +  top10PricePerformance.get(i).getSubjectproduct().getName() + ", " +
                                    " price performance " + top10PricePerformance.get(i).getSubjectproduct().getOrderPricePerformance());
        }   
        System.out.println();
        //System.out.println("====================================================================================");
        System.out.println("************************************************************************************");
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        // Part2--- Generate two reports with 10 best performing sales people
        System.out.println("************Part2: Generate two reports with 10 best performing sales people************" );
        System.out.println();
        System.out.println("-------Report 1: Top 10 best performing sales people by sales volume--------------" );
        EmployeeReport employeeReport = ed.generatEmployeeReport();
        ArrayList<EmployeeProfile> top10SalesVolumeProductReportEmployee = employeeReport.getTopTenSalesVolumesForEmployee();
        
        
        for (int i = 0; i < top10SalesVolumeProductReportEmployee.size(); i++) {     
                System.out.println("#" + (i + 1) + ": " + employeeReport.getEmployeeSaleProductList().get(i).getPerson().getPersonId() + ", " + 
                                    " sales volume " + employeeReport.getEmployeeSaleProductList().get(i).getSalesVolumeForEmployee());
        }    
            
        System.out.println();
    
        
        System.out.println("-------Report 2: Top 10 best performing sales people by price performance--------------" );
        ArrayList<EmployeeProfile> top10PricePerformanceProductReportEmployee = employeeReport.getTopTenPricePerformanceForEmployee();
        
        
        for (int i = 0; i < top10PricePerformanceProductReportEmployee.size(); i++) {     
                System.out.println("#" + (i + 1) + ": " + employeeReport.getEmployeeSaleProductList().get(i).getPerson().getPersonId() + ", " + 
                                    " price performance " + employeeReport.getEmployeeSaleProductList().get(i).getPricePerformanceEmployee());
        }  
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        // part3
        System.out.println("************Part3: Generate a report with 10 largest suppliers by sales volume************" );
        System.out.println();
        System.out.println("-------Report 1: Top 10 best suppliers by sales volume--------------" );
        int cnt = 1;
        for (int i = 0; i < 20; i++) {
            Supplier tmpSupplier = sd.newSupplier("suppier" + (i + 2));
            ProductCatalog tmpProductCatalog = new ProductCatalog("Car");
            tmpSupplier.setProductcatalog(tmpProductCatalog);
            ArrayList<Integer> actualPrices = new ArrayList<>();
            for (int j = 0; j < 2; j++) {
                Random rand = new Random();
                int num0 = 1000 + rand.nextInt(2000);// 1000~3000
                int num1 = 5000 + rand.nextInt(3000);// 5000~8000
                int num2 = num0 + rand.nextInt(num1 - num0); // higher than min, lower than max
                actualPrices.add(num0 + rand.nextInt(num1 - num0));
                tmpProductCatalog.newProduct("newCar"+ cnt, num0, num1, num2);
                cnt++;
            }
            Random randii = new Random(i);
            Person tmpEmp = pd.newPerson("1111" + i);
            EmployeeProfile tmpEmplpyee = ed.newEmployeeProfile(tmpEmp);
            Person tmpCu = pd.newPerson("9999" + i);
            CustomerProfile tmpCustomer = cd.newCustomerProfile(tmpCu);
            Order tmpOrder = mol.newOrder(tmpCustomer, tmpEmplpyee);
            int productIndex = randii.nextInt(tmpProductCatalog.getProducts().size());
            Product tmpProduct = tmpProductCatalog.getProducts().get(productIndex);
            OrderItem io = tmpOrder.newOrderItem(tmpProduct, actualPrices.get(productIndex), 1 + randii.nextInt(1));
            
        }
        SupplierReport supplierReport = new SupplierReport(sd.getSuppliers());
        ArrayList<Supplier> rankSuppliers = supplierReport.getTopTenSalesVolumes();
        
        
        for (int i = 0; i < rankSuppliers.size(); i++) {     
                System.out.println("#" + (i + 1) + ": " + supplierReport.getsupplierlist().get(i).getName() + ", " + 
                                    " sales volume " + supplierReport.getsupplierlist().get(i).getSalesVolume());
        }    
        System.out.println();    
        System.out.println("************************************************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
   
    }
    
}
