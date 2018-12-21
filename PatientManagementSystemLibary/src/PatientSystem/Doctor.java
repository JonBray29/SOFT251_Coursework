/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.Random;

/**
 *
 * @author Jonbr
 */
public class Doctor extends SystemUsers {
    
    //remove this constructor and change systemusers construtor to variables
    public Doctor() {
        
    }
    
    public Doctor(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, String password) {
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
        SystemUsers.userId = "D" + rand.nextInt(10000);
            if (registeredUsers.containsKey(SystemUsers.userId)){
                newUsername();
            }
            else{
                return SystemUsers.userId;
            }
        return SystemUsers.userId;
    }
    
  
}
