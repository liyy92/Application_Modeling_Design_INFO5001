/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.VaccinationManagement;

import VaccinePassport.HealthcareFacility.HealthcareFacility;
import VaccinePassport.Persona.HealthcareProvider;
import VaccinePassport.Persona.Patient;

/**
 *
 * @author reaso
 */
public class VaccinationAppointment {
    String appointmentID;
    String date;
    HealthcareProvider healthcareProvider;
    HealthcareFacility healthcareFacility;
    Vaccine vaccine;
    Patient vaccinee;

    public VaccinationAppointment(String appointmentID, String date, HealthcareProvider healthcareProvider, HealthcareFacility healthcareFacility, Vaccine vaccine, Patient vaccinee) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.healthcareProvider = healthcareProvider;
        this.healthcareFacility = healthcareFacility;
        this.vaccine = vaccine;
        this.vaccinee = vaccinee;
    }

    public String getDate() {
        return date;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }
    
    
    public void patientGetVacciated() {
    
    }

    public HealthcareProvider getHealthcareProvider() {
        return healthcareProvider;
    }
    public HealthcareFacility getHealthcareFacility() {
        return healthcareFacility;
    }

    public Patient getVaccinee() {
        return vaccinee;
    }
    
    public String toString() {
        return "" + healthcareProvider + healthcareFacility + vaccine + vaccinee;
    }
    
    
}
