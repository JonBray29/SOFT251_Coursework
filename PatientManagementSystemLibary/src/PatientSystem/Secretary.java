/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jonbr
 */
public class Secretary extends SystemUsers {
        
    private ArrayList notifications;

    
    public Secretary(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
        this.notifications = new ArrayList();
           
    }
    
    protected static String newUsername() {
        Random rand = new Random();
        SystemUsers.userId = "S" + rand.nextInt(10000);
            if (registeredUsers.containsKey(SystemUsers.userId)  == true){
                newUsername();
            }
            else{
                return SystemUsers.userId;
            }
        return SystemUsers.userId;
    }

    /*Setters*/
    public void setNotifications(ArrayList notifications) {
        this.notifications = notifications;
    }
    /*Getters*/
    public ArrayList getNotifications() {
        return notifications;
    }
}
