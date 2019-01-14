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
    private String date;
    private String time;
    private static ArrayList<RequestAppointment> requestAppointment;
    
    private RequestAppointment(Doctor doctor, Patient patient, String date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date= date;
        this.time = time;
    }
    
    public void createAppointment(Doctor doctor, Patient patient, String date, String time) {
        RequestAppointment appointment = new RequestAppointment(doctor, patient, date, time);
        requestAppointment.add(appointment);
        String notification = "New appointment requested: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
            i.getNotifications().add(notifications);
        }
    }
    
    /*Setters*/
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
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
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public static ArrayList<RequestAppointment> getRequestAppointment() {
        return requestAppointment;
    }
    
}
