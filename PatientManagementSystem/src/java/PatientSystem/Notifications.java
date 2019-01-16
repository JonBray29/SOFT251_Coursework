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
    
    
}
