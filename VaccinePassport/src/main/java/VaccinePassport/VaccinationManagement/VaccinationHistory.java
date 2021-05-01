/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.VaccinationManagement;

import java.util.ArrayList;

/**
 *
 * @author reaso
 */
public class VaccinationHistory {
    ArrayList<Vaccination> vaccinationList;

    public VaccinationHistory() {
        vaccinationList = new ArrayList();
    }
    
    
    
    public void addVaccination(Vaccination vaccination) {
        vaccinationList.add(vaccination);
    
    }

    public ArrayList<Vaccination> getVaccinationList() {
        return vaccinationList;
    }
        
    
    
}
