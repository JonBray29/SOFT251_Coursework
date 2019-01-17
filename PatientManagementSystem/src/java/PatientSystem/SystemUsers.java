/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.HashMap;
import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author Jonbr
 */
public abstract class SystemUsers implements Serializable{
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
                user = new Admin(userId, firstName, lastName, addressLineOne, city, postcode, password, age, gender); 
                break;
            case"doctor":
                user = new Doctor(userId, firstName, lastName, addressLineOne, city, postcode, password, age, gender);
                break;
            case"secretary":
                user = new Secretary(userId, firstName, lastName, addressLineOne, city, postcode, password, age, gender);
                break;
            case"patient":
                user = new Patient(userId, firstName, lastName, addressLineOne, city, postcode, password, age, gender);
                break;
            default:
                user = null;
        }
        return user;
    }
    
    public static String createId(String type){
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
    
    public static void addToHashmap(String userId, String password) {
        registeredUsers.put(userId, password);
        writeHashmap();
    }
    
        
    public static void addToList(SystemUsers user) {
        UsersSingleton.getInstance().getListOfUsers().add(user);
        write();
    }
    
    /*public static boolean login(String userId, String password) { 
        readHashmap();
        if(password == registeredUsers.get(userId)  == true) {
            //Allow login
            return true;
        }
        else {
            //password not recognised
            return false;
        }
    }*/
    
    public static boolean login(String userId, String password) {
        read();
        boolean login = false;
        //for(SystemUsers s : UsersSingleton.getInstance().getListOfUsers()){
          if(userId == userId && password == password){
                login = true;
            }

        //return login;  
        //}
    return login;   
    }
    
    public void removeUser(String userId) {
        //Remove user account
        for(SystemUsers s : UsersSingleton.getInstance().getListOfUsers()) {
            if(s.getUserId() == userId) {
                UsersSingleton.getInstance().getListOfUsers().remove(s);
                write();
            }
        }
    }
    
    //Serialization
    public static void write() {        
        try {
            FileOutputStream fileWrite = new FileOutputStream("user_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(UsersSingleton.getInstance().getListOfUsers());
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }
    
    
    public static void writeHashmap() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("hashmap_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(registeredUsers);
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static void read(){
        //ArrayList<SystemUsers> user = new ArrayList<>();
        try {
            FileInputStream fileRead = new FileInputStream("user_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileRead);
            ArrayList<SystemUsers> user = (ArrayList<SystemUsers>) in.readObject();       
            in.close();
            fileRead.close();
            UsersSingleton.getInstance().setListOfUsers(user);
            //for(SystemUsers s : user) {
            //    UsersSingleton.getInstance().getListOfUsers().add(s);
            //}
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }    
    
    public static void readHashmap(){
        registeredUsers = null;
      try
      {
         FileInputStream fileRead = new FileInputStream("hashmap_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         registeredUsers = (HashMap<String, String>) in.readObject();
         in.close();
         fileRead.close();  
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
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
