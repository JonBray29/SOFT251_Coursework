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
public class Admin extends SystemUsers {
    
    //remove this constructor and change systemusers construtor to variables
    public Admin(){
            
    }
    
    public Admin(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
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
        String userId = "A" + rand.nextInt(10000);
            if (registeredUsers.containsKey(userId)  == true){
                newUsername();
            }
            else{
                return userId;
            }
        return userId;
    }
    
    
}
