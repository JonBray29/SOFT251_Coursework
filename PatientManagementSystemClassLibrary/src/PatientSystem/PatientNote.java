/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.Date;
import java.io.*;

/**
 *
 * @author Jonbr
 */
public class PatientNote implements Serializable{
    private String notes;
    private Date date;
    private String time;
    
    private PatientNote(String notes, Date date, String time){
        this.notes = notes;
        this.date = date;
        this.time = time;
    }
    
    public void createNote(String notes, Date date, String time, Patient patient) {
        PatientNote note = new PatientNote(notes, date, time);
        patient.getNotes().add(note);
        write(note);
        Patient.write(patient);
    }
    
    
    //Serialization
    public static void write(PatientNote note) {
        Serialiser.writeObject(note, "patient_notes_file.ser");
    }

    public static Serializable read(){
        Serializable patientNote = null;
        try {
         FileInputStream fileRead = new FileInputStream("patient_notes_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            patientNote = (Serializable) in.readObject();
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return patientNote;
    }  


    /*Setters*/
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }

    /*Getters*/
    public String getNotes() {
        return notes;
    }
    public Date getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }   
    
    
}