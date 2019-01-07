/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

/**
 *
 * @author Jonbr
 */
public class RequestAccount {
    
    private String firstName;
    private String lastName;
    private String addressLineOne;
    private String city;
    private String postcode;
    private String password;
    private int age;
    private Secretary secretary;
    private Patient patient;

    private RequestAccount(String firstName, String lastName, String addressLineOne, String city, String postcode, String password, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
        this.age = age;
    }
    
    public void requestAccount(){
        RequestAccount account = new RequestAccount(firstName, lastName, addressLineOne, city, postcode, password, age);
        secretary.getNotifications().add(account);
    }
    
    public void requestTermination() {
        String termination = patient + " Requested account termination";
        secretary.getNotifications().add(termination);
    }

    /*Setters*/
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

    /*Getters*/
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
    
}
