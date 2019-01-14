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
    private ArrayList<Appointments> patientAppointments;
    private ArrayList<Prescription> prescriptions;
    private ArrayList<PatientNote> notes;
    private ArrayList<Notifications> notifications;
    
    public Patient (String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
    String password, int age, String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.patientAppointments = new ArrayList<Appointments>();
        this.prescriptions = new ArrayList<Prescription>();
        this.notes = new ArrayList<PatientNote>();
        this.notifications = new ArrayList<Notifications>();
    }
    
    protected static String newUsername() {
        Random rand = new Random();
        String userId = "P" + rand.nextInt(10000);
            if (registeredUsers.containsKey(userId)  == true){
                newUsername();
            }
            else{
                return userId;
            }
        return userId;
    }
    
    /*Setters*/

    public void setPatientAppointments(ArrayList<Appointments> patientAppointments) {
        this.patientAppointments = patientAppointments;
    }
    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    public void setNotes(ArrayList<PatientNote> notes) {
        this.notes = notes;
    }
    public void setNotifications(ArrayList<Notifications> notifications) {
        this.notifications = notifications;
    }

    /*Getters*/
    public ArrayList<Appointments> getPatientAppointments() {
        return patientAppointments;
    }
    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }
    public ArrayList<PatientNote> getNotes() {
        return notes;
    }
    public ArrayList<Notifications> getNotifications() {
        return notifications;
    }

     
}
