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
    protected static HashMap<String, String> registeredUsers = new HashMap<String, String>();
    
    public static SystemUsers createUser(String type, String userId, String firstName, String lastName, String addressLineOne, 
        String city, String postcode, String password, int age, String gender){
        SystemUsers user;
        switch(type){
            case"admin":
                user = new Admin(userId, firstName, lastName, addressLineOne, city, postcode, password); 
                break;
            case"doctor":
                user = new Doctor(userId, firstName, lastName, addressLineOne, city, postcode, password);
                break;
            case"secretary":
                user = new Secretary(userId, firstName, lastName, addressLineOne, city, postcode, password);
                break;
            case"patient":
                user = new Patient(userId, firstName, lastName, addressLineOne, city, postcode, password, age, gender);
                break;
            default:
                user = null;
        }
        UsersSingleton.getInstance().getListOfUsers().add(user); //method cant be in factory, so change to seperate method, add to contoller?
        return user;
    }
    
    private String createId(String type){
        String userId;
        switch(type.toLowerCase()){
            case"admin":
                userId = Admin.newUsername();
                break;
            case"doctor":
                userId = Doctor.newUsername();
                break;
            case"secretary":
                userId = Secretary.newUsername();
                break;
            case"patient":
                userId = Patient.newUsername();
                break;
            default:
                userId = null;
        }
        return userId;
    }
    
    public void addToHashmap(String userId, String password) {
        registeredUsers.put(userId, password);
    }
    
    public void login(String userId, String password) { 
        if(registeredUsers.containsKey(userId)  == true) {
            if(password == registeredUsers.get(userId)  == true) {
                /*Allow login*/
            }
            else {
                /*password not recognised*/
            }
        }
        else {
            /*Username not recognised*/
        }
    }
    
    public void removeUser(SystemUsers user) {
        //Remove user account
    }
    
    /*setters*/
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setFirstName(String firstName) {
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
