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
public class RequestOrder {
    private Medicine medicine;
    private static ArrayList<RequestOrder> requestOrder;

    public RequestOrder(Medicine medicine) {
        this.medicine = medicine;
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
