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
public class Appointments implements Serializable{
    private Doctor doctor;
    private Patient patient;
    private Date date;
    private String time;
    private static ArrayList<Appointments> allAppointments = new ArrayList<Appointments>();
    
    private Appointments(Doctor doctor, Patient patient, Date date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }
    
    public void createAppointment(Doctor doctor, Patient patient, Date date, String time) {
        Appointments appointment = new Appointments(doctor, patient, date, time);
        String notification = "New appointment has been made: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        doctor.getDoctorAppointments().add(appointment);
        doctor.getNotifications().add(notifications);
        patient.getPatientAppointments().add(appointment);
        patient.getNotifications().add(notifications);
        allAppointments.add(appointment);
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
    public static void setAllAppointments(ArrayList<Appointments> allAppointments) {
        Appointments.allAppointments = allAppointments;
    }  
    
    //Serialization
    public static void write(Appointments appointment) {
        Serialiser.writeObject(appointment, "appointment_file.ser");
    }
    public static void read() {
        Appointments appointment = (Appointments) Serialiser.readObject("appointment_file.ser");
        allAppointments.add(appointment);
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
    public static ArrayList<Appointments> getAllAppointments() {
        return allAppointments;
    }
      
    
}
