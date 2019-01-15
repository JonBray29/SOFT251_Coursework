/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Jonbr
 */
public class Prescription implements Serializable{
    private Doctor doctor;
    private Patient patient;
    private String notes;
    private Medicine medicine;
    private int quantity;
    private String dosage;
    
    private Prescription(Doctor doctor, Patient patient, String notes, Medicine medicine, int quantity, String dosage) {
        this.doctor = doctor;
        this.patient = patient;
        this.notes = notes;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    };
    
    public void createPrescription(Doctor doctor, Patient patient, String notes, Medicine medicine, int quantity, String dosage) {
        Prescription prescription = new Prescription(doctor, patient, notes, medicine, quantity, dosage);
        patient.getPrescriptions().add(prescription);
        PrescriptionsSingleton.getInstance().getUncollectedPrescriptions().add(prescription);
        write(prescription);
        Patient.write(patient);
    }
    
    public void collectPrescription(Prescription prescription) {        
        for(Prescription p : PrescriptionsSingleton.getInstance().getUncollectedPrescriptions()) {
            for(Medicine m : Medicine.getListOfMedicine()){
                if(m == p.getMedicine()) {
                    Stock.updateStock("remove", m, quantity);
                }
            }
            PrescriptionsSingleton.getInstance().getUncollectedPrescriptions().remove(p);
        }
    }
    
    //Serialization
    public static void write(Prescription prescription) {
        Serialiser.writeObject(prescription, "prescription_file.ser");
    }

    public static Serializable read(){
        Serializable prescription = null;
        try {
         FileInputStream fileRead = new FileInputStream("prescription_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            prescription = (Serializable) in.readObject();
            PrescriptionsSingleton.getInstance().getUncollectedPrescriptions().add((Prescription) prescription);
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return prescription;
    }    

    /*Setters*/
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    
    /*Getters*/
    public Doctor getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getNotes() {
        return notes;
    }
    public Medicine getMedicine() {
        return medicine;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getDosage() {
        return dosage;
    }
          
}
