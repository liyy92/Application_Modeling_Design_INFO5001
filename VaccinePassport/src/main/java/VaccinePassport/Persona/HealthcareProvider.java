/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.Persona;

import VaccinePassport.HealthcareFacility.HealthcareFacility;
import VaccinePassport.VaccinationManagement.VaccinationAppointment;
import VaccinePassport.VaccinationManagement.*;

/**
 *
 * @author reaso
 */
public class HealthcareProvider {
    private String name;
    private String healthcareID;
    private String title;
    private HealthcareFacility healthcareFacility;
    private boolean isQualified;

    public HealthcareProvider(String name, String healthcareID, String title, HealthcareFacility healthcareFacility, boolean isQualified) {
        this.name = name;
        this.healthcareID = healthcareID;
        this.title = title;
        this.healthcareFacility = healthcareFacility;
        this.isQualified = isQualified;
    }
    
    public Vaccination processVaccination(VaccinationAppointment vap, Patient p) {
        Vaccination v = new Vaccination(vap);
        VaccinationCertification vc = reportVaccinationHistory(v);
        if (vc != null) {
            p.addVaccineationCertification(vc);
        }
        return v;

    }
    
    public VaccinationCertification reportVaccinationHistory(Vaccination vaccination) { 
        return healthcareFacility.addVaccinationHistory(vaccination);
        
        
        
    
    }
    public boolean isQualified() {
        return isQualified;
    }
    public String getName() {
        return name;
    }

    public String getHealthcareID() {
        return healthcareID;
    }
    
    
    public String toString() {
        return "" + name + healthcareID;
    }
    
    
    
}
