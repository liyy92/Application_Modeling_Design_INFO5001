/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.HealthcareFacility;


import VaccinePassport.VaccinationManagement.*;
import VaccinePassport.Persona.*;
import VaccinePassport.WHODatabase.WHODatabase;
import com.github.javafaker.Faker;
import java.util.*;

/**
 *
 * @author reaso
 */
public class HealthcareFacility {
    String name;
    HashMap<String, HealthcareProvider> healthcareProviderList;
    String location;
    ArrayList<Patient> patientList;
    HashMap<String, VaccinationAppointment> appointmentRecord;
    HashMap<String, Vaccine> vaccineInventory;
    HashMap<String, VaccinationHistory> vaccinationHistory;
    HashMap<String, VaccinationCertification> CertificationRecord;
    Boolean isQualified;
    int appointmentCount;
    WHODatabase db;
    Faker f = new Faker();

    public HealthcareFacility(String name, String location,  Boolean isQualified, WHODatabase db) {
        this.name = name;
        healthcareProviderList = new HashMap<>();
        this.location = location;
        patientList = new ArrayList();
        appointmentRecord = new HashMap<>();
        vaccineInventory = new HashMap<>();
        vaccinationHistory = new HashMap<>();
        CertificationRecord = new HashMap<>();
        this.isQualified = isQualified;
        this.db = db;
    }
    

    public void addHealthcareProvider(HealthcareProvider hp) {
        healthcareProviderList.put(hp.getName(), hp);
    }
    
    public VaccinationAppointment arrangeVaccination(Patient p, String date) {
        List<HealthcareProvider> hpList = new ArrayList<>(healthcareProviderList.values());
        Random r = new Random();
        if(hpList.size() == 0) {
            return null;
        }
        int index = r.nextInt(hpList.size());
        HealthcareProvider hp = hpList.get(index);
        ArrayList<Vaccine> vaccineList = new ArrayList<>(vaccineInventory.values());
        if (vaccineList.size() <= 0) {
            System.out.println(name + " " + "does not have vaccine");
            return null;
        } 
        Vaccine vaccine = vaccineList.get(vaccineList.size() - 1);
        vaccineInventory.remove(vaccine.getSerialNumber());
        String appointmentID = "appointmentID_" + this.appointmentCount++;
        VaccinationAppointment vap = new VaccinationAppointment(appointmentID, date, hp, this, vaccine, p);
        appointmentRecord.put(appointmentID, vap);
        patientList.add(p);
        return vap;
    
    }
    
    public VaccinationCertification addVaccinationHistory(Vaccination vaccination) {
        String patientName = vaccination.getPatientName();
        if (!vaccinationHistory.containsKey(patientName)) {
            VaccinationHistory vh = new VaccinationHistory();
            vaccinationHistory.put(patientName, vh);
        }
        vaccinationHistory.get(patientName).addVaccination(vaccination);
        

        
        if (vaccinationHistory.get(patientName).getVaccinationList().size() == 2 ) {
            String certificationID = f.idNumber().invalidSvSeSsn();
            VaccinationCertification vc = new VaccinationCertification(certificationID, patientName);
            for (int i = 0; i < 2; i++) {
                vc.addVaccination(vaccinationHistory.get(patientName).getVaccinationList().get(i));
            } 
            if (isQualified == true){
                db.addCertification(vc);
                return vc;
            }  
        } 
        return null;

    }
    
    public void addVaccine(Vaccine vaccine) {
        String vaccineNumber = vaccine.getSerialNumber();
        vaccineInventory.put(vaccineNumber, vaccine);
        
        
    
    }

    public Boolean isQualified() {
        return isQualified;
    }
    
    public HealthcareProvider getRandomHealthcareProvider() {
        Random r = new Random();
        int randomIndex = r.nextInt(healthcareProviderList.size());
        List<String> providerNames = new ArrayList<>(healthcareProviderList.keySet());
        return healthcareProviderList.get(providerNames.get(randomIndex));
        
        
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
    
    public VaccinationHistory getVaccineHistory(String patientName) {
        if (!vaccinationHistory.containsKey(patientName)) {
            return new VaccinationHistory();
        }
        else {
            return vaccinationHistory.get(patientName);
        }
    }
    
}
