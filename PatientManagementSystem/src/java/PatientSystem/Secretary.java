/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jonbr
 */
public class Secretary extends SystemUsers implements Serializable{
        
    private ArrayList<Notifications> notifications  = new ArrayList<>();

    
    public Secretary(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
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
        String userId = "S" + randomNum;
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

    /*Setters*/
    public void setNotifications(ArrayList<Notifications> notifications) {
        this.notifications = notifications;
    }
    
    /*Getters*/
    public ArrayList<Notifications> getNotifications() {
        return notifications;
    }
  
}
