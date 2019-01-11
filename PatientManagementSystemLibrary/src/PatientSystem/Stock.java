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
    private static ArrayList<Stock> listOfStock = new ArrayList<Stock>();
    
    private Stock(Medicine medicine, int quantityInStock, double priceToBuy) {
        this.medicine = medicine;
        this.quantityInStock = quantityInStock;
        this.priceToBuy = priceToBuy;
    }

    public void createStock(){
        Stock stock = new Stock(medicine, quantityInStock, priceToBuy);
        listOfStock.add(stock);
    }
    
    public void checkStock() {
        for(Stock s : listOfStock)
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
    
    public void updateStock(String type, Medicine medicine, int quantity) {
        //Updates the stock whether it's a collection or delivery, do switch statement for type.
        switch(type.toLowerCase()){
            case"add":
                //add medicine for all in listOfStock, if getMedicine = medicine update.
                break;
            case"remove":
                //remove medicine
                break;
        }
    }
       
    /*Setters*/
    public void setQuantityInStock(int quantityInStock) {
    this.quantityInStock = quantityInStock;
    }
    public void setPriceToBuy(double priceToBuy) {
        this.priceToBuy = priceToBuy;
    }
    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    public static void setListOfStock(ArrayList<Stock> listOfStock) {
        Stock.listOfStock = listOfStock;
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
    public static ArrayList<Stock> getListOfStock() {
        return listOfStock;
    }
    
}
