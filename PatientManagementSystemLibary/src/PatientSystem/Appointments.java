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
public class Appointments {
    private Doctor doctor;
    private Patient patient;
    private String dateTime;
    
    public Appointments(Doctor doctor, Patient patient, String datetime) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }

    /*Setters*/
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /*Getters*/
    public Doctor getDoctor() {
        return doctor;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getDateTime() {
        return dateTime;
    }
    
    
    
}
