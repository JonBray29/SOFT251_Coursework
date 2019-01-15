/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Jonbr
 */
public class PrescriptionsSingleton implements Serializable{
    
    private static PrescriptionsSingleton instance;
    private ArrayList<Prescription> uncollectedPrescriptions = null;
    
    private PrescriptionsSingleton() {
        uncollectedPrescriptions = new ArrayList<>();

    }
    
    public static PrescriptionsSingleton getInstance() {
        if(instance == null) {
            instance = new PrescriptionsSingleton();
        }    
        return instance;
    }
    
    public ArrayList<Prescription> getUncollectedPrescriptions() {
        return uncollectedPrescriptions;
    }
}
