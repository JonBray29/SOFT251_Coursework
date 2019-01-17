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
    private static ArrayList<RequestOrder> requestOrder = new ArrayList<RequestOrder>();

    public RequestOrder(Medicine medicine) {
        this.medicine = medicine;
    }

    /**
    * creates request of order which is useful for doctor to use to request more stock or new stock
    * 
    * @param medicine is the medicine that needs to be ordered
    */
    public void createRequestOrder(Medicine medicine) {
        RequestOrder order = new RequestOrder(medicine);
        requestOrder.add(order);
        String notification = "New order requested: " + order.toString();
        Notifications notifications = new Notifications(notification);
        for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
            i.getNotifications().add(notifications);
        }
        SystemUsers.write();        
        write();
    }
    
    //Serialization
    public static void write() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("request_order_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(requestOrder);
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static void read(){
        try {
            FileInputStream fileRead = new FileInputStream("request_order_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileRead);
            ArrayList<RequestOrder> order = (ArrayList<RequestOrder>)in.readObject();    
            setRequestOrder(order);
            in.close();
            fileRead.close();
            /*for(RequestOrder o : order) {
                requestOrder.add(o);
            }*/
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
    }    
    
    public void delete(RequestOrder order) {
        requestOrder.remove(order);
        write();
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
