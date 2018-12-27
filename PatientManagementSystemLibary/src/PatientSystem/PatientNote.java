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
public class PatientNote {
    private String notes;
    private String dateTime;
    private Patient patient;
    
    public PatientNote(String notes, String dateTime){
        this.notes = notes;
        this.dateTime = dateTime;
    }
    
    public void createNote() {
        PatientNote note = new PatientNote(notes, dateTime);
        patient.getNotes().add(note);
    }

    /*Setters*/
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /*Getters*/
    public String getNotes() {
        return notes;
    }
    public String getDateTime() {
        return dateTime;
    }
    public Patient getPatient() {
        return patient;
    }
    
    
    
}
