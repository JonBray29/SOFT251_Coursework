/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

/**
 *
 * @author Jonbr
 */
public class Prescription {
    private static Doctor doctor;
    private static Patient patient;
    private static String notes;
    private static Medicine medicine;
    private static int quantity;
    private static String dosage;
    
    public Prescription(Doctor doctor, Patient patient, String notes, Medicine medicine, int quantity, String dosage) {
        this.doctor = doctor;
        this.patient = patient;
        this.notes = notes;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    };

    /*Setters*/
    public static void setDoctor(Doctor doctor) {
        Prescription.doctor = doctor;
    }
    public static void setPatient(Patient patient) {
        Prescription.patient = patient;
    }
    public static void setNotes(String notes) {
        Prescription.notes = notes;
    }
    public static void setMedicine(Medicine medicine) {
        Prescription.medicine = medicine;
    }
    public static void setQuantity(int quantity) {
        Prescription.quantity = quantity;
    }
    public static void setDosage(String dosage) {
        Prescription.dosage = dosage;
    }
    
    /*Getters*/
    public static Doctor getDoctor() {
        return doctor;
    }
    public static Patient getPatient() {
        return patient;
    }
    public static String getNotes() {
        return notes;
    }
    public static Medicine getMedicine() {
        return medicine;
    }
    public static int getQuantity() {
        return quantity;
    }
    public static String getDosage() {
        return dosage;
    }
          
}
