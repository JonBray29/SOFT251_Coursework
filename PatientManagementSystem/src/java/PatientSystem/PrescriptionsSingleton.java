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
    private static ArrayList<Prescription> uncollectedPrescriptions = null;
    
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
    
    //Serialization
    public static void write() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("uncollected_prescriptions_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(PrescriptionsSingleton.getInstance().getUncollectedPrescriptions());
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }
    
    public static void read(){
        try {
            FileInputStream fileRead = new FileInputStream("uncollected_prescriptions_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileRead);
            ArrayList<Prescription> prescription = (ArrayList<Prescription>)in.readObject(); 
            setUncollectedPrescriptions(prescription);
            in.close();
            fileRead.close();
            /*for(Prescription p : prescription) {
                uncollectedPrescriptions.add(p);
            }*/
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }

    public static void setUncollectedPrescriptions(ArrayList<Prescription> uncollectedPrescriptions) {
        PrescriptionsSingleton.uncollectedPrescriptions = uncollectedPrescriptions;
    }
    
    
}
