/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.HashMap;

/**
 *
 * @author Jonbr
 */
public abstract class SystemUsers {
    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String addressLineOne;
    protected String city;
    protected String postcode;
    protected String password;
    protected int age;
    protected String gender;
    protected HashMap<String, SystemUsers> map = new HashMap<String, SystemUsers>();
    
    public static SystemUsers createUser(String type){
        SystemUsers user;
        createId(type);
        switch(type){
            case"admin":
                user = new Admin(); // (username, firstname, lastname, address, cityaddress, postcodeAddress, pass);
                break;
            case"doctor":
                user = new Doctor(); // (username, firstname, lastname, address, cityaddress, postcodeAddress, "password");
                break;
            case"secretary":
                user = new Secretary(); // (username, firstname, lastname, address, cityaddress, postcodeAddress, "password");
                break;
            case"patient":
                user = new Patient(); // (username, firstname, lastname, address, cityaddress, postcodeAddress, pass);
                break;
            default:
                user = null;
        }
        return user;
    }
    
    private static String createId(String type){
        String username;
        switch(type){
            case"admin":
                username = Admin.newUsername();
                break;
            case"doctor":
                username = Doctor.newUsername();
                break;
            case"secretary":
                username = Secretary.newUsername();
                break;
            case"patient":
                username = Patient.newUsername();
                break;
            default:
                username = null;
        }
        return username;
    }
    
    public String getUserId() {
        return userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getAddressLineOne() {
        return addressLineOne;
    }
    public String getCity() {
        return city;
    }
    public String getPostcode() {
        return postcode;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    } 
}
