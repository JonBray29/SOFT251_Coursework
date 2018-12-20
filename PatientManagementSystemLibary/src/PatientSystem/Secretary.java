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
public class Secretary extends SystemUsers {
        
    //remove this constructor and change systemusers construtor to variables
    public Secretary() {
            
    }
    
    public Secretary(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
    }
    
    protected static String newUsername() {
        String username;
        Random rand = new Random();
        username = "S" + rand.nextInt(10000);
            if (registeredUsers.containsKey(username)){
                newUsername();
            }
            else{
                return username;
            }
        return username;
    }
    
    public void setUserId(String userId) {
        
        this.userId = userId;
    }
    public void setfirstName(String firstName) {
        
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
