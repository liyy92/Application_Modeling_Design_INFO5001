/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.VaccinationManagement;

/**
 *
 * @author reaso
 */
public class Vaccine {
    String vaccineManufacturers;
    String serialNumber;

    public Vaccine(String vaccineManufacturers, String serialNumber) {
        this.vaccineManufacturers = vaccineManufacturers;
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getVaccineManufacturers() {
        return vaccineManufacturers;
    }
    
    public String toString() {
        return vaccineManufacturers + serialNumber;
    }
    

    
    
    
    
    
}
