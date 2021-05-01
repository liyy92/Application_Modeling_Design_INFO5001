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
public class VaccinationCertification {
    String certificationID;
    String patientName;
    ArrayList<Vaccination> vaccinationList; 

    public VaccinationCertification(String certificationID, String name) {
        this.certificationID = certificationID;
        patientName = name;
        vaccinationList = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }
    
    public void addVaccination(Vaccination vaccination) { 
        vaccinationList.add(vaccination);
        
        
    }

    public ArrayList<Vaccination> getVaccinationList() {
        return vaccinationList;
    }
    
    public String getID() {
        return certificationID;
    }
    public String toString() {
        return certificationID + patientName + vaccinationList;
    }
    
    
}
