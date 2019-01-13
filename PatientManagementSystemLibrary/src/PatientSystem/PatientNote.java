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
    private String date;
    private String time;
    private Patient patient;
    
    private PatientNote(String notes, String date, String time){
        this.notes = notes;
        this.date = date;
        this.time = time;
    }
    
    public void createNote(String notes, String date, String time) {
        PatientNote note = new PatientNote(notes, date, time);
        patient.getNotes().add(note);
    }

    /*Setters*/
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /*Getters*/
    public String getNotes() {
        return notes;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public Patient getPatient() {
        return patient;
    }
    
    
    
}
