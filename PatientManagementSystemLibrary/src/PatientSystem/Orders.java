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
public class Orders {
    private Medicine medicine;
    private int quantity;
    private static ArrayList<Orders> listOfOrders;
    
    private Orders(Medicine medicine, int quantity) {
        this.medicine = medicine;
        this.quantity = quantity;
    }

    public void createOrders(){
        Orders order = new Orders(medicine, quantity);
        listOfOrders.add(order);
    }
    
    public void deliverOrder(String selectedMedicine, int quantity) {
        //Simulate a delivery, updates the stock using existing update method.
        for(Medicine m : Medicine.getListOfMedicine()) {
            if(m.getName() == selectedMedicine) {
            Stock.updateStock("add", m, quantity);
            }
        }
    }
    
    /*Setters*/
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*getters*/
    public Medicine getMedicine() {
        return medicine;
    }
    public int getQuantity() {
        return quantity;
    }
    public static ArrayList<Orders> getListOfOrders() {
        return listOfOrders;
    }   
    
    
}
