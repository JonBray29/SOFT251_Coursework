/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Jonbr
 */
public class Patient extends SystemUsers implements Serializable{
    private ArrayList<Appointments> patientAppointments = new ArrayList<>();
    private ArrayList<Prescription> prescriptions = new ArrayList<>();
    private ArrayList<PatientNote> notes = new ArrayList<>();
    private ArrayList<Notifications> notifications = new ArrayList<>();
    
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
    }
    
    /**
    *
    * Method Creates a new number of 4 digits and adds prefix to it
    * it then returns this as userId type string
    */
    protected static String newUsername() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10000);
        String userId = "P" + randomNum;
        if (randomNum <= 1000) {
            newUsername();
        }
        else{
            if (registeredUsers.containsKey(userId)  == true){
                newUsername();
            }
            else{
                return userId;
            }
        return userId;  
        }
    return userId;
    }
    
    /**
    * returns patient object that has userId equal to userId
    * 
    * @param String userId
    */
    public static Patient getPatient(String userId) {
        SystemUsers.read();
        Patient patient = null;
        for(Patient p : UsersSingleton.getInstance().getListOfPatients()){
            if(p.getUserId() == userId){
                patient = p;
            }
        }
        return patient;
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
