/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientSystem;

/**
 *
 * @author Jonbr
 */
public class Orders {
    private Medicine medicine;
    private int quantity;
    
    private Orders(Medicine medicine, int quantity) {
        this.medicine = medicine;
        this.quantity = quantity;
    }

    public void createOrders(){
        Orders order = new Orders(medicine, quantity);
    }
    
    public void deliverOrder() {
        //Simulate a delivery, updates the stock using existing update method.
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
    
    
    
}
