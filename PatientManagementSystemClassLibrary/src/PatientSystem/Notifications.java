/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;

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
    public static void read() {
        Notifications notification = (Notifications) Serialiser.readObject("notificaation_file.ser");
    }
}
