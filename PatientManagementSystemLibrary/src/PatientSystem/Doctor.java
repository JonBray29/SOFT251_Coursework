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
public class Doctor extends SystemUsers {
    private ArrayList<Appointments> doctorAppointments;
    private ArrayList<Ratings> ratings;
    private ArrayList<Notifications> notifications;
    
    public Doctor(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
    String password, int age, String gender) {
        /*this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;*/
        this.doctorAppointments = new ArrayList<Appointments>();
        this.ratings = new ArrayList<Ratings>();
        this.notifications = new ArrayList<Notifications>();
    }
    
    protected static String newUsername() {
        Random rand = new Random();
        String userId = "D" + rand.nextInt(10000);
            if (registeredUsers.containsKey(userId)  == true){
                newUsername();
            }
            else{
                return userId;
            }
        return userId;
    }

    /*Setters*/
    public void setDoctorAppointments(ArrayList doctorAppointments) {
        this.doctorAppointments = doctorAppointments;
    }
    public void setRatings(ArrayList ratings) {
        this.ratings = ratings;
    }
    public void setNotifications(ArrayList notifications) {
        this.notifications = notifications;
    }    
    
    /*Getters*/
    public ArrayList getDoctorAppointments() {
        return doctorAppointments;
    }
    public ArrayList getRatings() {
        return ratings;
    }
    public ArrayList getNotifications() {
        return notifications;
    }    
  
}
