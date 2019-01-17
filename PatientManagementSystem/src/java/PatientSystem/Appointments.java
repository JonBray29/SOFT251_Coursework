/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author Jonbr
 */
public class Appointments implements Serializable{
    private Doctor doctor;
    private Patient patient;
    private String date;
    private String time;
    private static ArrayList<Appointments> allAppointments = new ArrayList<Appointments>();
    
    private Appointments(Doctor doctor, Patient patient, String date, String time) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
        this.time = time;
    }
    
    /**
    * creates a new appointment using parameters
    * 
    * @param doctor is the doctor who will have the appointment
    * @param patient is the patient who will have the appointment
    * @param date is the date of the appointment
    * @param time is the time of the appointment
    */
    public static void createAppointment(Doctor doctor, Patient patient, String date, String time) {
        Appointments appointment = new Appointments(doctor, patient, date, time);
        String notification = "New appointment has been made: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        doctor.getDoctorAppointments().add(appointment);
        doctor.getNotifications().add(notifications);
        patient.getPatientAppointments().add(appointment);
        patient.getNotifications().add(notifications);
        allAppointments.add(appointment);   
        write();
        SystemUsers.write();
    }
 
    
    //Serialization
    public static void write() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("appointment_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(allAppointments);
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static void read(){
        try {
            FileInputStream fileRead = new FileInputStream("appointment_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileRead);
            ArrayList<Appointments> appointment = (ArrayList<Appointments>)in.readObject();       
            in.close();
            fileRead.close();
            setAllAppointments(appointment);
            /*for(Appointments a : appointment) {
                allAppointments.add(a);
            }*/
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
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
    public static void setAllAppointments(ArrayList<Appointments> allAppointments) {
        Appointments.allAppointments = allAppointments;
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
    public static ArrayList<Appointments> getAllAppointments() {
        return allAppointments;
    }
      
    
}
