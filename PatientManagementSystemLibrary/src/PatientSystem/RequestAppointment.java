/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.ArrayList;

/**
 *
 * @author Jonbr
 */
public class RequestAppointment {
    
    private Doctor doctor;
    private Patient patient;
    private String dateTime;
    private static ArrayList<RequestAppointment> requestAppointment;
    
    private RequestAppointment(Doctor doctor, Patient patient, String dateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }
    
    public void createAppointment() {
        RequestAppointment appointment = new RequestAppointment(doctor, patient, dateTime);
        requestAppointment.add(appointment);
        String notification = "New appointment requested: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        /*notify all secretarys, add list of secretarys and loop through list*/
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
    public static void setRequestAppointment(ArrayList<RequestAppointment> requestAppointment) {
        RequestAppointment.requestAppointment = requestAppointment;
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
    public static ArrayList<RequestAppointment> getRequestAppointment() {
        return requestAppointment;
    }
    
}
