/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

/**
 *
 * @author Jonbr
 */
public class Appointments {
    private Doctor doctor;
    private Patient patient;
    private String dateTime;
    
    private Appointments(Doctor doctor, Patient patient, String dateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }
    
    public void createAppointment() {
        Appointments appointment = new Appointments(doctor, patient, dateTime);
        String notification = "New appointment has been made: " + appointment.toString();
        Notifications notifications = new Notifications(notification);
        doctor.getDoctorAppointments().add(appointment);
        doctor.getNotifications().add(notifications);
        patient.getPatientAppointments().add(appointment);
        patient.getNotifications().add(notifications);
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
    
    
    
}
