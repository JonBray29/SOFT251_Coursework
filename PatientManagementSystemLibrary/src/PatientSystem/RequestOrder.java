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
        }
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
