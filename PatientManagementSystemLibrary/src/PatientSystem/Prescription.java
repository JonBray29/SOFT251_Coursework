/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.ArrayList;

/**
 *
 * @author Jonbr
 */
public class Prescription {
    private Doctor doctor;
    private Patient patient;
    private String notes;
    private Medicine medicine;
    private int quantity;
    private String dosage;
    private static ArrayList<Prescription> uncollectedPrescriptions;
    
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
        uncollectedPrescriptions.add(prescription);
    }
    
    public void collectPrescription(String selectedMedicine) {
        //Delete from uncollected prescriptions, also update the stock, using current update method.
        
        for(Medicine m : Medicine.getListOfMedicine()) {
            if(m.getName() == selectedMedicine) {
            Stock.updateStock("remove", m, quantity);
            }
        }
        Stock.updateStock("remove", medicine, quantity);
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

    public static ArrayList<Prescription> getUncollectedPrescriptions() {
        return uncollectedPrescriptions;
    }
    
          
}
