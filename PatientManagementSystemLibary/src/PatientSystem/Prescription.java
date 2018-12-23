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
    private Doctor doctor;
    private Patient patient;
    private String notes;
    private Medicine medicine;
    private int quantity;
    private String dosage;
    
    public Prescription(Doctor doctor, Patient patient, String notes, Medicine medicine, int quantity, String dosage) {
        this.doctor = doctor;
        this.patient = patient;
        this.notes = notes;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    };
}
