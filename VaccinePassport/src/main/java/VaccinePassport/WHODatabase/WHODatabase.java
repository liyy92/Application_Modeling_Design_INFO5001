/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.WHODatabase;

import VaccinePassport.VaccinationManagement.*;
import java.util.*;
import VaccinePassport.Persona.HealthcareProvider;
import VaccinePassport.HealthcareFacility.HealthcareFacility;



/**
 *
 * @author reaso
 */
public class WHODatabase {
    String name;
    HashMap<String, VaccinationCertification> vaccinationCertificationList;
    
    public WHODatabase(String name) {
        this.name = name;
        vaccinationCertificationList = new HashMap<>();
    }
    public boolean verifyCertification(String vaccinationCertificationID) {
        if (!vaccinationCertificationList.containsKey(vaccinationCertificationID)) {
            return false;
        }
        VaccinationCertification vc = vaccinationCertificationList.get(vaccinationCertificationID);
        ArrayList<Vaccination> vcList = vc.getVaccinationList();
        
        for (Vaccination v : vcList) {
            HealthcareProvider hp = v.getHealthcareProvider();
            if (!hp.isQualified()) {
                return false;
            }
            HealthcareFacility hf = v.getHealthcareFacility();
            if (!hf.isQualified()) {
                return false;
            }
        }
        return true;
    }
    
    public void addCertification(VaccinationCertification vc) {
        vaccinationCertificationList.put(vc.getID(), vc);
    }
    
    
}
