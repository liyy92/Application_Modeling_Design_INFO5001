/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication.Personnel;

import java.util.Comparator;

/**
 *
 * @author reaso
 */
public class EmployeePricePerformanceComparator implements Comparator<EmployeeProfile>{

    @Override
    public int compare(EmployeeProfile o1, EmployeeProfile o2) {
        return (-1)*Integer.compare(o1.getPricePerformanceEmployee(), o2.getPricePerformanceEmployee()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
