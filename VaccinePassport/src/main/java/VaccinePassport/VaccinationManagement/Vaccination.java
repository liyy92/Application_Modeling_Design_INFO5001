/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.VaccinationManagement;
import VaccinePassport.VaccinationManagement.*;
import VaccinePassport.Persona.HealthcareProvider;
import VaccinePassport.HealthcareFacility.HealthcareFacility;



/**
 *
 * @author reaso
 */
public class Vaccination {
    VaccinationAppointment vaccinationAppointment;
    boolean isSucceed;

    public Vaccination(VaccinationAppointment vaccinationAppointment) {
        this.vaccinationAppointment = vaccinationAppointment;
    }
    
    public String getPatientName() {
        String patientName = vaccinationAppointment.getVaccinee().getName();
        return patientName;
        
    }

    public HealthcareProvider getHealthcareProvider() {
        
        return vaccinationAppointment.getHealthcareProvider();
    }
    
    public HealthcareFacility getHealthcareFacility() {
        return vaccinationAppointment.getHealthcareFacility();
    }

    public VaccinationAppointment getVaccinationAppointment() {
        return vaccinationAppointment;
    }
    
    public String getSerialNum() {
        return vaccinationAppointment.vaccine.serialNumber;
    }
    
}
