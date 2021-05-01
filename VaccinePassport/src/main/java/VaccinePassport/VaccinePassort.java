package VaccinePassport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import VaccinePassport.HealthcareFacility.HealthcareFacility;
import VaccinePassport.Persona.HealthcareProvider;
import VaccinePassport.Persona.HealthcareProviderDirectory;
import VaccinePassport.Persona.Patient;
import VaccinePassport.Persona.PatientDirectory;
import VaccinePassport.VaccinationManagement.Vaccination;
import VaccinePassport.VaccinationManagement.Vaccine;
import VaccinePassport.WHODatabase.WHODatabase;
import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author reaso
 */
public class VaccinePassort {
    
    public static void main(String[] args) {
        Faker f = new Faker();
        WHODatabase WHO = new WHODatabase("World Health Origanization");
        
        // Create 3 Healthcare Facilities, 2 are qualified, 1 is inqualified.
        HealthcareFacility stanfordHealthCare = new HealthcareFacility("Stanford Health Care", "2518 Mission College Blvd #101, Santa Clara, CA 95054", true, WHO);
        HealthcareFacility paloAltoMedicalFoundation = new HealthcareFacility("Palo Alto Medical Foundation", "301 Old San Francisco Rd, Sunnyvale, CA 94086", true, WHO);
        HealthcareFacility castleOfWinterfell = new HealthcareFacility("Castle of Winterfell", "Castle Ward in Northern Ireland", false, WHO);
        List<Patient> pd = new ArrayList<>();
        HealthcareProviderDirectory hd = new HealthcareProviderDirectory();
        List<HealthcareFacility> facilities = new ArrayList<>();
        List<Vaccine> vaccines = new ArrayList<>();
        facilities.add(stanfordHealthCare);
        facilities.add(paloAltoMedicalFoundation);
        facilities.add(castleOfWinterfell);
        for (int i = 0; i < 12; i++) {
            Patient patient = new Patient(f.name().firstName(), f.idNumber().invalid());
            pd.add(patient);
        }
        for(int i = 0; i < 11; i++) {
           HealthcareProvider healthcareProvider = new HealthcareProvider(f.name().lastName(), f.idNumber().toString(), "Doctor", facilities.get(i % facilities.size()), true);
           hd.addHealthcareProvider(healthcareProvider);
           facilities.get(i % facilities.size()).addHealthcareProvider(healthcareProvider);
        }
        String[] companies = new String[]{"Pfizer", "Moderna"};
        for (int i = 0; i < 50; i++) {
            vaccines.add(new Vaccine(companies[i % 2], f.lorem().characters(8, 16)));
        }
        for(int i = 0; i < vaccines.size(); i++) {
            facilities.get(i % facilities.size()).addVaccine(vaccines.get(i));
        }
        for (int i = 0; i < pd.size(); i++) {
            pd.get(i).bookAppointmentVaccine(facilities.get(i % facilities.size()), f.date().past(30, TimeUnit.DAYS).toString());
            if (i < 8) {
                pd.get(i).bookAppointmentVaccine(facilities.get(i % facilities.size()), f.date().past(30, TimeUnit.DAYS).toString());
            }
        }
        for (int i = 0; i < pd.size(); i++) {
            pd.get(i).getVaccinated();
            if (i < 8) {
                pd.get(i).getVaccinated();
            }
        }
        
        /*for(int i = 0; )
        // create patients
        Patient patient1 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient2 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient3 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient4 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient5 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient6 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient7 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient8 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient9 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient10 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient11 = new Patient(f.name().firstName(), f.idNumber().invalid());
        Patient patient12 = new Patient(f.name().firstName(), f.idNumber().invalid());
        
        // create vaccines
        Vaccine vaccine1 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine2 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine3 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine4 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine5 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine6 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine7 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine8 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine9 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine10 = new Vaccine("Moderna", f.lorem().characters(8, 16));
        Vaccine vaccine11 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine12 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine13 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine14 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine15 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine16 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine17 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine18 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine19 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine20 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
        Vaccine vaccine21 = new Vaccine("Pfizer", f.lorem().characters(8, 16));
  

        // create healthproviders and add vaccinesin stanfordHealthCare
        HealthcareProvider healthcareProvider1 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", stanfordHealthCare, true);
        HealthcareProvider healthcareProvider2 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", stanfordHealthCare, true);
        HealthcareProvider healthcareProvider3 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", stanfordHealthCare, true);
        HealthcareProvider healthcareProvider4 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", stanfordHealthCare, true);
        HealthcareProvider healthcareProvider5 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", stanfordHealthCare, true);
        stanfordHealthCare.addHealthcareProvider(healthcareProvider1);
        stanfordHealthCare.addHealthcareProvider(healthcareProvider2);
        stanfordHealthCare.addHealthcareProvider(healthcareProvider3);
        stanfordHealthCare.addHealthcareProvider(healthcareProvider4);
        stanfordHealthCare.addHealthcareProvider(healthcareProvider5);
        
        
        stanfordHealthCare.addVaccine(vaccine1);
        stanfordHealthCare.addVaccine(vaccine2);
        stanfordHealthCare.addVaccine(vaccine3);
        stanfordHealthCare.addVaccine(vaccine4);
        stanfordHealthCare.addVaccine(vaccine5);
        stanfordHealthCare.addVaccine(vaccine6);
        stanfordHealthCare.addVaccine(vaccine7);
        stanfordHealthCare.addVaccine(vaccine8);
        stanfordHealthCare.addVaccine(vaccine9);
        stanfordHealthCare.addVaccine(vaccine10);
        
        
        //  create healthproviders and add vaccinesin palo alto medical foundation
        HealthcareProvider healthcareProvider6 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", paloAltoMedicalFoundation, true);
        HealthcareProvider healthcareProvider7 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", paloAltoMedicalFoundation, true);
        HealthcareProvider healthcareProvider8 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", paloAltoMedicalFoundation, true);
        HealthcareProvider healthcareProvider9 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", paloAltoMedicalFoundation, true);
        HealthcareProvider healthcareProvider10 = new HealthcareProvider(f.name().lastName(), f.idNumber().invalid(), "Doctor", paloAltoMedicalFoundation, true);
        paloAltoMedicalFoundation.addHealthcareProvider(healthcareProvider6);
        paloAltoMedicalFoundation.addHealthcareProvider(healthcareProvider7);
        paloAltoMedicalFoundation.addHealthcareProvider(healthcareProvider8);
        paloAltoMedicalFoundation.addHealthcareProvider(healthcareProvider9);
        paloAltoMedicalFoundation.addHealthcareProvider(healthcareProvider10);
        

        paloAltoMedicalFoundation.addVaccine(vaccine11);
        paloAltoMedicalFoundation.addVaccine(vaccine12);
        paloAltoMedicalFoundation.addVaccine(vaccine13);
        paloAltoMedicalFoundation.addVaccine(vaccine14);
        paloAltoMedicalFoundation.addVaccine(vaccine15);
        paloAltoMedicalFoundation.addVaccine(vaccine16);
        paloAltoMedicalFoundation.addVaccine(vaccine17);
        paloAltoMedicalFoundation.addVaccine(vaccine18);
        paloAltoMedicalFoundation.addVaccine(vaccine19);
        paloAltoMedicalFoundation.addVaccine(vaccine20);
        
        //  create healthproviders and add vaccinesin castle of winterfell(unqualified)
        HealthcareProvider healthcareProvider11 = new HealthcareProvider("Jon Sonw", f.idNumber().invalid(), "Doctor", castleOfWinterfell, false);
        castleOfWinterfell.addHealthcareProvider(healthcareProvider11);
        castleOfWinterfell.addVaccine(vaccine21);

        // patients book appointment for vaccination in stanford healthcare and get vaccinated
        patient1.bookAppointmentVaccine(stanfordHealthCare, healthcareProvider1.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient1.bookAppointmentVaccine(stanfordHealthCare, healthcareProvider2.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient2.bookAppointmentVaccine(stanfordHealthCare, healthcareProvider3.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient2.bookAppointmentVaccine(stanfordHealthCare, healthcareProvider4.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient1.getVaccinated();
        patient1.getVaccinated();
        patient2.getVaccinated();
        patient2.getVaccinated();


        // patients book appointment for vaccination in palo alto medical foundation and get vaccinated
        patient6.bookAppointmentVaccine(paloAltoMedicalFoundation, healthcareProvider6.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient6.bookAppointmentVaccine(paloAltoMedicalFoundation, healthcareProvider6.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient7.bookAppointmentVaccine(paloAltoMedicalFoundation, healthcareProvider6.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient7.bookAppointmentVaccine(paloAltoMedicalFoundation, healthcareProvider6.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient8.bookAppointmentVaccine(paloAltoMedicalFoundation, healthcareProvider6.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient8.bookAppointmentVaccine(paloAltoMedicalFoundation, healthcareProvider6.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient6.getVaccinated();
        patient6.getVaccinated();
        patient7.getVaccinated();
        patient7.getVaccinated();
        patient8.getVaccinated();
        patient8.getVaccinated();
        
        // patients book appointment for vaccination in winterfell and get vaccinated
        patient9.bookAppointmentVaccine(castleOfWinterfell, healthcareProvider11.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient9.bookAppointmentVaccine(castleOfWinterfell, healthcareProvider11.getName(), f.date().future(90, TimeUnit.DAYS).toString());
        patient9.getVaccinated();
        patient9.getVaccinated();
        
        
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient6);
        patientList.add(patient7);
        patientList.add(patient8);
        patientList.add(patient9);*/
        
        System.out.println("----Part 1 : print certification----");
        for(Patient patient : pd)  {
            if(patient.getVaccinationCertification() == null) {
                System.out.println("Patient Name: " + patient.getName() + " has not certification");
                System.out.println("---------------");
                continue;
            }
            System.out.println("Patient Name: " + patient.getVaccinationCertification().getPatientName());
            System.out.println("COVID-19 Vaccination - 'Status: Vaccinated' ");
            System.out.println("Certification ID: " + patient.getVaccinationCertification().getID());
            System.out.println("   ");
            System.out.println("Detial: ");
            for (int i = 0; i < patient.getVaccinationHistoryList().getVaccinationList().size(); i++) {
                
                System.out.println(i + 1 +" shot");
                System.out.println("Manufacturer: " + patient.getVaccinationCertification().getVaccinationList().get(i).getVaccinationAppointment().getVaccine().getVaccineManufacturers());
                System.out.println("Date: " + patient.getVaccinationCertification().getVaccinationList().get(i).getVaccinationAppointment().getDate());
                System.out.println("Healthcare Facility: " + patient.getVaccinationCertification().getVaccinationList().get(i).getVaccinationAppointment().getHealthcareFacility().getName());
                System.out.println("Location: " + patient.getVaccinationCertification().getVaccinationList().get(i).getVaccinationAppointment().getHealthcareFacility().getLocation());
                System.out.println("Healthcare Provider: " + patient.getVaccinationCertification().getVaccinationList().get(i).getVaccinationAppointment().getHealthcareProvider().getName());
                //System.out.println("Location: " + patient.getVaccinationCertification().getVaccinationList().get(i).getVaccinationAppointment().getVaccine().getSerialNumber());
                System.out.println("-------------------------------------");
                System.out.println(" ");
                
            }
            System.out.println("=======================================");


        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("----Part 2 : verify certification/healthcare provider/ healthcare facility----");
        for(Patient patient : pd)  {
            if(WHO.verifyCertification(patient.getCertificationID()) == true) {
                System.out.println(patient.getVaccinationCertification().getPatientName() + "'s certification has been verified successfully");
                System.out.println("---------------");
            } else {
                System.out.println(patient.getName() + "'couldn't find certification");
                if (!patient.getVaccinationHistoryList().getVaccinationList().get(0).getHealthcareFacility().isQualified()) {
                System.out.println(patient.getVaccinationHistoryList().getVaccinationList().get(0).getHealthcareFacility().getName() + "isn't qualified");
                System.out.println(patient.getVaccinationHistoryList().getVaccinationList().get(0).getHealthcareProvider().getName() + "isn't qualified");
                }
            
            }
            


        }
        
        /*System.out.println("After getting vaccine" + stanfordHealthCare.getVaccineHistory(patient1.getName()).getVaccinationList().size());
        for(Vaccination v: stanfordHealthCare.getVaccineHistory(patient1.getName()).getVaccinationList()) {
            System.out.println("Serial num" + v.getSerialNum() + " certification: " + patient1.getVaccinationCertification() + " " );
        }
        for(Vaccination v: patient1.getVaccinationHistoryList().getVaccinationList()) {
            System.out.println("Serial num" + v.getSerialNum() + " certification: " + patient1.getVaccinationCertification() + " " );
        }
        
        System.out.println(WHO.verifyCertification(patient1.getVaccinationCertification().getID()));*/
        
        
        /*System.out.println("----Part 1 : whether patient is normal----");
        for(Patient patient : patientList) {
                 if (patient.isPatientNormal() == true){
                     System.out.println("This patient " + patient.getName() + " is normal");
                 } else {
                        System.out.println("This patient " + patient.getName()+ " is abnormal");;
                    }
            }  
        }*/
        /*System.out.println("After getting vaccine" + stanfordHealthCare.getVaccineHistory(patient1.getName()).getVaccinationList().size());
        for(Vaccination v: stanfordHealthCare.getVaccineHistory(patient1.getName()).getVaccinationList()) {
            System.out.println("Serial num" + v.getSerialNum() + " certification: " + patient1.getVaccinationCertification() + " " );
        }
        for(Vaccination v: patient1.getVaccinationHistoryList().getVaccinationList()) {
            System.out.println("Serial num" + v.getSerialNum() + " certification: " + patient1.getVaccinationCertification() + " " );
        }
        
        System.out.println(WHO.verifyCertification(patient1.getVaccinationCertification().getID()));*/
        
        
        
        
        
    }
           
}
        /*System.out.println(patient1.getName());
        System.out.println(patient2.getName());
        System.out.println(patient3.getName());
        System.out.println(patient4.getName());
         System.out.println(patient4.getName());
        System.out.println("=======");*/


        /*System.out.println(healthcareProvider1.getName());
        System.out.println(healthcareProvider2.getName());
        System.out.println(healthcareProvider3.getName());
        System.out.println(healthcareProvider1.getName());*/

/*for (int i = 0; i < 10; i++) {
            patientDirectory.addPatient(new Patient(f.name().firstName(), f.idNumber().toString()));
            HealthcareProvider healthcareProvider1 = new HealthcareProvider(f.name().lastName(), f.idNumber().toString(), "Doctor", stanfordHealthCare, true);
            HealthcareProvider healthcareProvider2 = new HealthcareProvider(f.name().lastName(), f.idNumber().toString(), "Doctor", paloAltoMedicalFoundation, true);
            stanfordHealthCare.addHealthcareProvider(healthcareProvider1);
            paloAltoMedicalFoundation.addHealthcareProvider(healthcareProvider2);
            
        }
        
        
        for (int i = 0; i < 10; i++) {
            Patient randomPatient = patientDirectory.getRandomPatient();
            HealthcareProvider randomHealthcareProviderStanford = stanfordHealthCare.getRandomHealthcareProvider();
            HealthcareProvider randomHealthcareProviderPalo = paloAltoMedicalFoundation.getRandomHealthcareProvider();
            randomPatient.bookAppointmentVaccine(stanfordHealthCare, randomHealthcareProviderStanford.getName(), f.date().future(90, TimeUnit.DAYS).toString());
            randomPatient.bookAppointmentVaccine(paloAltoMedicalFoundation, randomHealthcareProviderPalo.getName(), f.date().future(90, TimeUnit.DAYS).toString());
            randomPatient.getVaccinated();
        }*/