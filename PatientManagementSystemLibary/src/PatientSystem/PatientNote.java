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
    
    public PatientNote(String notes, String dateTime){
        this.notes = notes;
        this.dateTime = dateTime;
    }

    /*Setters*/
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    /*Getters*/
    public String getNotes() {
        return notes;
    }
    public String getDateTime() {
        return dateTime;
    }
    
    
    
}