/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.Persona;

import VaccinePassport.VaccinationManagement.VaccinationAppointment;
import VaccinePassport.VaccinationManagement.VaccinationCertification;
import VaccinePassport.VaccinationManagement.VaccinationHistory;
import VaccinePassport.HealthcareFacility.HealthcareFacility;
import VaccinePassport.VaccinationManagement.Vaccination;
import java.util.*;

/**
 *
 * @author reaso
 */
public class Patient {
    String name;
    String patientID;
    VaccinationHistory vaccinationHistoryList;
    public LinkedList<VaccinationAppointment> vaccinationAppointmentList;
    VaccinationCertification vaccinationCertification;
   

    public Patient(String name, String patientID) {
        this.name = name;
        this.patientID = patientID;
        vaccinationHistoryList = new VaccinationHistory();
        vaccinationAppointmentList = new LinkedList();
    }

    public VaccinationCertification getVaccinationCertification() {
        return vaccinationCertification;
    }

    public VaccinationHistory getVaccinationHistoryList() {
        return vaccinationHistoryList;
    }

    public void addVaccineationCertification(VaccinationCertification vc) {
        this.vaccinationCertification = vc;
    }
    
    
    public boolean bookAppointmentVaccine(HealthcareFacility hf, String date) {
        VaccinationAppointment vp = hf.arrangeVaccination(this, date); 
        if (vp != null) {
            vaccinationAppointmentList.add(vp);
            return true;
        }
        return false;
    } 
    
    public void getVaccinated() {
        if (vaccinationAppointmentList.size() == 0) {
            System.out.println("Patient " + name + " does not have appointment!");
            return;
        }
        VaccinationAppointment vap = vaccinationAppointmentList.get(0);
        vaccinationAppointmentList.remove(0);
        HealthcareProvider hp = vap.getHealthcareProvider();
        Vaccination vaccination = hp.processVaccination(vap, this);
        vaccinationHistoryList.addVaccination(vaccination);
    
    }

    public String getCertificationID() {
        if (vaccinationCertification != null) {
            return vaccinationCertification.getID();
        }
        return "";
    }
    
    public String getName() {
        return name;
    }
    
    public String toString () {
        return name;
    }

    
    
    
    
    
    
    
}
