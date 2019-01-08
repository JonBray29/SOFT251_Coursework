/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Jonbr
 */
public class Patient extends SystemUsers {
    private ArrayList patientAppointments;
    private ArrayList prescriptions;
    private ArrayList notes;
    private ArrayList notifications;
    
    public Patient (String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
    String password, int age, String gender) {
        /*this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.patientAppointments = new ArrayList();
        this.prescriptions = new ArrayList();
        this.notes = new ArrayList();
        this.notifications = new ArrayList();*/
    }
    
    protected static String newUsername() {
        Random rand = new Random();
        SystemUsers.userId = "P" + rand.nextInt(10000);
            if (registeredUsers.containsKey(SystemUsers.userId)  == true){
                newUsername();
            }
            else{
                return SystemUsers.userId;
            }
        return SystemUsers.userId;
    }
    
    /*Setters*/
    public void setPatientAppointments(ArrayList patientAppointments) {
        this.patientAppointments = patientAppointments;
    }
    public void setPrescriptions(ArrayList prescriptions) {
        this.prescriptions = prescriptions;
    }
    public void setNotes(ArrayList notes) {
        this.notes = notes;
    }
    public void setNotifications(ArrayList notifications) {
        this.notifications = notifications;
    }

    /*Getters*/
    public ArrayList getPatientAppointments() {
        return patientAppointments;
    }
    public ArrayList getPrescriptions() {
        return prescriptions;
    }
    public ArrayList getNotes() {
        return notes;
    }
    public ArrayList getNotifications() {
        return notifications;
    }
     
}
