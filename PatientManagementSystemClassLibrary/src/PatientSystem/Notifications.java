/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.io.*;

/**
 *
 * @author Jonbr
 */
public class Notifications implements Serializable{
    String notification; 

    public Notifications(String notification) {
        this.notification = notification;
    }
    
    //Serialization
    public static void write(Notifications notification) {
        Serialiser.writeObject(notification, "notification_file.ser");
    }
    public static Serializable read(){
        Serializable notification = null;
        try {
         FileInputStream fileRead = new FileInputStream("notification_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            notification = (Serializable) in.readObject();
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return notification;
    } 
}
