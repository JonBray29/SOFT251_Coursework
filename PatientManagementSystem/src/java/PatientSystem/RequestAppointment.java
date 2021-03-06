/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.io.*;

/**
 *
 * @author Jonbr
 */
public class RequestAppointment implements Serializable{
    
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String time;
    private static ArrayList<RequestAppointment> requestAppointment = new ArrayList<RequestAppointment>();
    
    private RequestAppointment(Doctor doctor, Patient patient, String date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }
    
    /**
    * creates request of a new appointment using parameters
    * 
    * @param doctor is the doctor who will have the appointment
    * @param patient is the patient who will have the appointment
    * @param date is the date of the appointment
    * @param time is the time of the appointment
    */
    public static void createAppointment(Doctor doctor, Patient patient, String date, String time) {
        RequestAppointment appointment = new RequestAppointment(doctor, patient, date, time);
        requestAppointment.add(appointment);
        String notification = "New appointment requested: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
            i.getNotifications().add(notifications);
        }
        SystemUsers.write();
        write();
    }
    
    //Serialization
    public static void write() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("request_appointment_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(requestAppointment);
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static void read(){
        try {
            FileInputStream fileRead = new FileInputStream("request_appointment_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileRead);
            ArrayList<RequestAppointment> appointment = (ArrayList<RequestAppointment>)in.readObject();  
            setRequestAppointment(appointment);
            in.close();
            fileRead.close();
            /*for(RequestAppointment a : appointment) {
                requestAppointment.add(a);
            }*/
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }
    
    /**
    * deleted requests of appointment, useful for after requested appointment has been made/declined
    * 
    * @param appointment is the requested appointment that will be deleted 
    */
    public void delete(RequestAppointment appointment) {
        requestAppointment.remove(appointment);
        write();
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
