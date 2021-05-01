/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VaccinePassport.Persona;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author reaso
 */
public class PatientDirectory {
    ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }
    
    public void addPatient(Patient p) {
        patientList.add(p);
    }
    
    public Patient getRandomPatient() {
        Random r = new Random();
        int randomIndex = r.nextInt(patientList.size());
        return patientList.get(randomIndex);
    
    }
    public int size(){
        return patientList.size();
    }
    
}
