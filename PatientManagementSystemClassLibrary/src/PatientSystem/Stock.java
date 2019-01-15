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
public class Stock implements Serializable{
    private Medicine medicine;
    private int quantityInStock;
    private static ArrayList<Stock> listOfStock = new ArrayList<Stock>();
    
    private Stock(Medicine medicine, int quantityInStock) {
        this.medicine = medicine;
        this.quantityInStock = quantityInStock;
    }

    public void createStock(Medicine medicine, int quantityInStock){
        Stock stock = new Stock(medicine, quantityInStock);
        listOfStock.add(stock);
        write(stock);

    }
    
    public static void checkStock() {
        for(Stock s : listOfStock)
        {
            if (s.getQuantityInStock() <= 5)
            {
                String type = s.getMedicine().toString();
                String notification = type + " is running low on stock";
                Notifications notifications = new Notifications(notification);
                Notifications.write(notifications);
                for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
                    i.getNotifications().add(notifications);
                    Secretary.write(i);
                }
                Notifications.write(notifications);
            }
        }
    }
    
    public static void updateStock(String type, Medicine medicine, int quantity) {
        //Updates the stock whether it's a collection or delivery, do switch statement for type.
        int newQuantity;
        switch(type.toLowerCase()){
            case"add":
                //add medicine for all in listOfStock, if getMedicine = medicine update.

                for(Stock s : listOfStock) {
                    if(s.getMedicine() == medicine) {
                        newQuantity = s.getQuantityInStock() + quantity;
                        s.setQuantityInStock(newQuantity);
                        write(s);
                    }
                }
                checkStock();
                break;
            case"remove":
                for(Stock s : listOfStock) {
                    if(s.getMedicine() == medicine) {
                        newQuantity = s.getQuantityInStock() - quantity;
                        s.setQuantityInStock(newQuantity);
                        write(s);
                    }
                }
                checkStock();
                break;
        }
    }
       
    //Serialization
    public static void write(Stock stock) {
        Serialiser.writeObject(stock, "stock_file.ser");
    }
     
    public static Serializable read(){
        Serializable stock = null;
        try {
         FileInputStream fileRead = new FileInputStream("stock_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            stock = (Serializable) in.readObject();
            listOfStock.add((Stock) stock);
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return stock;
    } 
    
    /*Setters*/
    public void setQuantityInStock(int quantityInStock) {
    this.quantityInStock = quantityInStock;
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
    public static ArrayList<Stock> getListOfStock() {
        return listOfStock;
    }
    
}
