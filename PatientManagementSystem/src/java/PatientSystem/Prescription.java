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
    
    /**
    * creates new prescription and adds to lists
    * 
    * @param doctor what doctor created it
    * @param patient who its for
    * @param notes notes on reason of prescription
    * @param medicine what medicine is being prescribed
    * @param quantity amount
    * @param dosage how many should be taken and how often
    * 
    */ 
    public void createPrescription(Doctor doctor, Patient patient, String notes, Medicine medicine, int quantity, String dosage) {
        Prescription prescription = new Prescription(doctor, patient, notes, medicine, quantity, dosage);
        patient.getPrescriptions().add(prescription);
        PrescriptionsSingleton.getInstance().getUncollectedPrescriptions().add(prescription);
        PrescriptionsSingleton.write();
        SystemUsers.write();
    }
    
    public void collectPrescription(Prescription prescription) {        
        for(Prescription p : PrescriptionsSingleton.getInstance().getUncollectedPrescriptions()) {
            for(Medicine m : Medicine.getListOfMedicine()){
                if(m == p.getMedicine()) {
                    Stock.updateStock("remove", m, quantity);
                }
            }
            PrescriptionsSingleton.getInstance().getUncollectedPrescriptions().remove(p);
            PrescriptionsSingleton.write();
        }
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
