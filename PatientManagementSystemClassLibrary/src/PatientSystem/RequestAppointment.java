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
    
    public void createAppointment(Doctor doctor, Patient patient, String date, String time) {
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

    public static Serializable read(){
        Serializable appointment = null;
        try {
         FileInputStream fileRead = new FileInputStream("request_appointment_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            appointment = (Serializable) in.readObject();
            requestAppointment.add((RequestAppointment) appointment);
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return appointment;
    } 
    
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
