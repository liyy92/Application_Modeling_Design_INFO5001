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
public class HealthcareProviderDirectory {
    ArrayList<HealthcareProvider> healthcareProviderList;

    public HealthcareProviderDirectory() {
        healthcareProviderList = new ArrayList();
    }
    
    public void addHealthcareProvider(HealthcareProvider hp) {
        healthcareProviderList.add(hp);
    }
    
    public HealthcareProvider getRandomHealthcareProvider() {
        Random r = new Random();
        int randomIndex = r.nextInt(healthcareProviderList.size());
        return healthcareProviderList.get(randomIndex);
    
    }
    
}
