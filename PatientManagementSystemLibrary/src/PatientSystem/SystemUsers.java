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
    protected static String userId;
    protected static String firstName;
    protected static String lastName;
    protected static String addressLineOne;
    protected static String city;
    protected static String postcode;
    protected static String password;
    protected static int age;
    protected static String gender;
    protected static HashMap<String, String> registeredUsers = new HashMap<String, String>();
    
    public static SystemUsers createUser(String type){
        SystemUsers user;
        createId(type);
        switch(type){
            case"admin":
                user = new Admin(userId, firstName, lastName, addressLineOne, city, postcode, password); 
                registeredUsers.put(userId, password);
                break;
            case"doctor":
                user = new Doctor(userId, firstName, lastName, addressLineOne, city, postcode, password);
                registeredUsers.put(userId, password);
                break;
            case"secretary":
                user = new Secretary(userId, firstName, lastName, addressLineOne, city, postcode, password);
                registeredUsers.put(userId, password);
                break;
            case"patient":
                user = new Patient(userId, firstName, lastName, addressLineOne, city, postcode, password, age, gender);
                registeredUsers.put(userId, password);
                break;
            default:
                user = null;
        }
        UsersSingleton.getInstance().getListOfUsers().add(user);
        return user;
    }
    
    private static String createId(String type){
        switch(type){
            case"admin":
                SystemUsers.userId = Admin.newUsername();
                break;
            case"doctor":
                SystemUsers.userId = Doctor.newUsername();
                break;
            case"secretary":
                SystemUsers.userId = Secretary.newUsername();
                break;
            case"patient":
                SystemUsers.userId = Patient.newUsername();
                break;
            default:
                SystemUsers.userId = null;
        }
        return SystemUsers.userId;
    }
    
    public boolean login() { 
        if(registeredUsers.containsKey(userId)  == true) {
            if(userId == registeredUsers.get(userId)  == true) {
                /*Allow login*/
                return true;
            }
            else {
                /*password not recognised*/
                return false;
            }
        }
        else {
            /*Username not recognised*/
            return false;
        }
    }
    
    /*setters*/
    public static void setFirstName(String firstName) {
        SystemUsers.firstName = firstName;
    }
    public static void setLastName(String lastName) {
        SystemUsers.lastName = lastName;
    }
    public static void setAddressLineOne(String addressLineOne) {
        SystemUsers.addressLineOne = addressLineOne;
    }
    public static void setCity(String city) {
        SystemUsers.city = city;
    }
    public static void setPostcode(String postcode) {
        SystemUsers.postcode = postcode;
    }
    public static void setPassword(String password) {
        SystemUsers.password = password;
    }
    public static void setAge(int age) {
        SystemUsers.age = age;
    }
    public static void setGender(String gender) {
        SystemUsers.gender = gender;
    }    
    
    /*getters*/
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
