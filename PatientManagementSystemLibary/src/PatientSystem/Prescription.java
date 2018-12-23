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
    
    public static void createPrescription() {
        Prescription prescription = new Prescription(doctor, patient, notes, medicine, quantity, dosage);
    }
}
