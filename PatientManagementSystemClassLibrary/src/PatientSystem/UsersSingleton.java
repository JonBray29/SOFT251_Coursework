/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jonbr
 */
public class UsersSingleton implements Serializable{
    
    private static UsersSingleton instance;
    private ArrayList<SystemUsers> listOfUsers = null;
    private ArrayList<Secretary> listOfSecretarys = null;
    private ArrayList<Admin> listOfAdmins = null;
    private ArrayList<Doctor> listOfDoctors = null;
    private ArrayList<Patient> listOfPatients = null;
    
    

    private UsersSingleton() {
        listOfUsers = new ArrayList<>();
        listOfSecretarys = new ArrayList<>();
        listOfAdmins = new ArrayList<>();
        listOfDoctors = new ArrayList<>();
        listOfPatients = new ArrayList<>();
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
    
    public  ArrayList<Secretary> getListOfSecretarys() {
        for(SystemUsers s : listOfUsers) {
            if(s.getUserId().charAt(0) == 'S') {
                listOfSecretarys.add((Secretary) s);
            }
        }
        return listOfSecretarys;
    }
    
    public  ArrayList<Admin> getListOfAdmins() {
        for(SystemUsers s : listOfUsers) {
            if(s.getUserId().charAt(0) == 'A') {
                listOfAdmins.add((Admin) s);
            }
        }
        return listOfAdmins;
    }
    
    public  ArrayList<Doctor> getListOfDoctors() {
        for(SystemUsers s : listOfUsers) {
            if(s.getUserId().charAt(0) == 'D') {
                listOfDoctors.add((Doctor) s);
            }
        }
        return listOfDoctors;
    }
    
    public  ArrayList<Patient> getListOfPatients() {
        for(SystemUsers s : listOfUsers) {
            if(s.getUserId().charAt(0) == 'P') {
                listOfPatients.add((Patient) s);
            }
        }
        return listOfPatients;
    }

    public void setListOfUsers(ArrayList<SystemUsers> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }
    
    
}
