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
public abstract class SystemUsers {
    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String addressLineOne;
    protected String city;
    protected String postcode;
    protected String password;
    
    
    public String getUserId() {
        return userId;
    }

    public abstract void setUserId(String userId);

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLineOne;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLineOne = addressLineOne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
