/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.util.ArrayList;

/**
 *
 * @author Jonbr
 */
public class UsersSingleton {
    
    private static UsersSingleton instance;
    private ArrayList<SystemUsers> listOfUsers = null;

    private UsersSingleton() {
        listOfUsers = new ArrayList<SystemUsers>();
    }
    
    public static UsersSingleton getInstance() {
        if(instance == null) {
            instance = new UsersSingleton();
        }    
        return instance;
    }

    public ArrayList<SystemUsers> getListOfUsers() {
        return listOfUsers;
    }
    
}
