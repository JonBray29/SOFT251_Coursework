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
public class Admin extends SystemUsers {
    
        public Admin(String userId, String firstName, String lastName, String addressLineOne, String city, String postcode, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLineOne = addressLineOne;
        this.city = city;
        this.postcode = postcode;
        this.password = password;
    }
    
    public void setUserId(String userId) {
        
        this.userId = userId;
    }
    
}
