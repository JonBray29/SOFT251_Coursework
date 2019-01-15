/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.io.*;

/**
 *
 * @author Jonbr
 */
public class RequestOrder implements Serializable{
    private Medicine medicine;
    private static ArrayList<RequestOrder> requestOrder;

    public RequestOrder(Medicine medicine) {
        this.medicine = medicine;
    }

    public void createRequestOrder(Medicine medicine) {
        RequestOrder order = new RequestOrder(medicine);
        requestOrder.add(order);
        String notification = "New order requested: " + order.toString();
        Notifications notifications = new Notifications(notification);
        for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
            i.getNotifications().add(notifications);
            Secretary.write(i);
        }
        write(order);
    }
    
    //Serialization
    public static void write(RequestOrder order) {
        Serialiser.writeObject(order, "request_order_file.ser");
    }

    public static Serializable read(){
        Serializable order = null;
        try {
         FileInputStream fileRead = new FileInputStream("request_order_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            order = (Serializable) in.readObject();
            requestOrder.add((RequestOrder) order);
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return order;
    }     
    
    //setters
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    public static void setRequestOrder(ArrayList<RequestOrder> requestOrder) {
        RequestOrder.requestOrder = requestOrder;
    }
    
    //getters
    public Medicine getMedicine() {
        return medicine;
    }
    public static ArrayList<RequestOrder> getRequestOrder() {
        return requestOrder;
    }
    
    
}
