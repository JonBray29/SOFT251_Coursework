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
public class Patient extends SystemUsers {
    
    //remove this constructor and change systemusers construtor to variables
    public Patient() {
        
    }
    
    public Patient (String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, 
    String password, int age, String gender) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
        this.age = age;
        this.gender = gender;
    }
    
    protected static String newUsername() {
        String username;
        Random rand = new Random();
        username = "P" + rand.nextInt(10000);
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
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
