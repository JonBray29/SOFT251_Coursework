/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author Jonbr
 */
public class Admin extends SystemUsers implements Serializable{
    
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
        int randomNum = rand.nextInt(10000);
        String userId = "A" + randomNum;
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
    
    public static Admin getAdmin(String userId) {
        Admin admin = null;
        for(Admin a : UsersSingleton.getInstance().getListOfAdmins()){
            if(a.getUserId() == userId){
                admin = a;
            }
        }
        return admin;
    }
}
