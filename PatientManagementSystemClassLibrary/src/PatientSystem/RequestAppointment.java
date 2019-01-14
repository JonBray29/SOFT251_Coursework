/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jonbr
 */
public class RequestAppointment implements Serializable{
    
    private Doctor doctor;
    private Patient patient;
    private Date date;
    private String time;
    private static ArrayList<RequestAppointment> requestAppointment = new ArrayList<RequestAppointment>();
    
    private RequestAppointment(Doctor doctor, Patient patient, Date date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }
    
    public void createAppointment(Doctor doctor, Patient patient, Date date, String time) {
        RequestAppointment appointment = new RequestAppointment(doctor, patient, date, time);
        requestAppointment.add(appointment);
        String notification = "New appointment requested: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
            i.getNotifications().add(notifications);
            Secretary.write(i);
        }
        Notifications.write(notifications);
        write(appointment);
    }
    
    //Serialization
    public static void write(RequestAppointment appointment) {
        Serialiser.writeObject(appointment, "request_appointment_file.ser");
    }
    public static void read() {
        RequestAppointment appointment = (RequestAppointment) Serialiser.readObject("request_appointment_file.ser");
        requestAppointment.add(appointment);
    }      
    
    /*Setters*/
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setDate(Date date) {
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
    public Date getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public static ArrayList<RequestAppointment> getRequestAppointment() {
        return requestAppointment;
    }
    
}
