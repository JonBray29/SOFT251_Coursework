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
public class Doctor extends SystemUsers implements Serializable{
    private ArrayList<Appointments> doctorAppointments = new ArrayList<>();
    private ArrayList<Ratings> ratings = new ArrayList<>();
    private ArrayList<Notifications> notifications = new ArrayList<>();
    
    public Doctor(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
    String password, int age, String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
    }
    
    protected static String newUsername() {
        Random rand = new Random();
        int randomNum = rand.nextInt(10000);
        String userId = "D" + randomNum;
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
    
    public static Doctor getDoctor(String userId) {
        Doctor doctor = null;
        for(Doctor d : UsersSingleton.getInstance().getListOfDoctors()){
            if(d.getUserId() == userId){
                doctor = d;
            }
        }
        return doctor;
    }

    /*Setters*/
    public void setDoctorAppointments(ArrayList<Appointments> doctorAppointments) {
        this.doctorAppointments = doctorAppointments;
    }
    public void setRatings(ArrayList<Ratings> ratings) {
        this.ratings = ratings;
    }
    public void setNotifications(ArrayList<Notifications> notifications) {
        this.notifications = notifications;
    }

    /*Getters*/

    public ArrayList<Appointments> getDoctorAppointments() {
        return doctorAppointments;
    }

    public ArrayList<Ratings> getRatings() {
        return ratings;
    }

    public ArrayList<Notifications> getNotifications() {
        return notifications;
    }
    
  
}
