/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;

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
    private static ArrayList<Prescription> uncollectedPrescriptions = new ArrayList<Prescription>();
    
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
        write(prescription);
        Patient.write(patient);
    }
    
    public void collectPrescription(Prescription prescription) {        
        for(Prescription p : uncollectedPrescriptions) {
            for(Medicine m : Medicine.getListOfMedicine()){
                if(m == p.getMedicine()) {
                    Stock.updateStock("remove", m, quantity);
                }
            }
            uncollectedPrescriptions.remove(p);
        }
    }
    
    //Serialization
    public static void write(Prescription prescription) {
        Serialiser.writeObject(prescription, "prescription_file.ser");
    }
    public static void read() {
        Prescription prescription = (Prescription) Serialiser.readObject("prescription_file.ser");
        uncollectedPrescriptions.add(prescription);
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
    public static void setUncollectedPrescriptions(ArrayList<Prescription> uncollectedPrescriptions) {
        Prescription.uncollectedPrescriptions = uncollectedPrescriptions;
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
