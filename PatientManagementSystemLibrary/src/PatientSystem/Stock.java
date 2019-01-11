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
public class Stock {
    private Medicine medicine;
    private int quantityInStock;
    private double priceToBuy;
    private static ArrayList<Stock> listOfQuantity = new ArrayList<Stock>();
    
    private Stock(Medicine medicine, int quantityInStock, double priceToBuy) {
        this.medicine = medicine;
        this.quantityInStock = quantityInStock;
        this.priceToBuy = priceToBuy;
    }

    public void createStock(){
        Stock stock = new Stock(medicine, quantityInStock, priceToBuy);
        listOfQuantity.add(stock);
    }
    
    public void checkStock() {
        for(Stock s : listOfQuantity)
        {
            if (s.getQuantityInStock() <= 5)
            {
                String type = s.getMedicine().toString();
                String notification = type + " is running low on stock";
                Notifications notifications = new Notifications(notification);
                for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
                    i.getNotifications().add(notification);
                }
            }
        }
    }
       
    /*Setters*/
    public void setQuantityInStock(int quantityInStock) {
    this.quantityInStock = quantityInStock;
    }
    public void setPriceToBuy(double priceToBuy) {
        this.priceToBuy = priceToBuy;
    }
    public static void setListOfQuantity(ArrayList<Stock> listOfQuantity) {
        Stock.listOfQuantity = listOfQuantity;
    }
    
    
    /*Getters*/
    public Medicine getMedicine() {
        return medicine;
    }
    public int getQuantityInStock() {
        return quantityInStock;
    }
    public double getPriceToBuy() {
        return priceToBuy;
    }
    public static ArrayList<Stock> getListOfQuantity() {
        return listOfQuantity;
    }
    
}
