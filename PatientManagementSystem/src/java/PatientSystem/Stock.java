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
        write();

    }
    
    public static void checkStock() {
        for(Stock s : listOfStock)
        {
            if (s.getQuantityInStock() <= 5)
            {
                String type = s.getMedicine().toString();
                String notification = type + " is running low on stock";
                Notifications notifications = new Notifications(notification);
                for(Secretary i : UsersSingleton.getInstance().getListOfSecretarys()) {
                    i.getNotifications().add(notifications);
                    SystemUsers.write();
                }
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
                        write();
                    }
                }
                checkStock();
                break;
            case"remove":
                for(Stock s : listOfStock) {
                    if(s.getMedicine() == medicine) {
                        newQuantity = s.getQuantityInStock() - quantity;
                        s.setQuantityInStock(newQuantity);
                        write();
                    }
                }
                checkStock();
                break;
        }
    }
       
    //Serialization
    public static void write() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("stock_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(listOfStock);
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
            ArrayList<Stock> stock = (ArrayList<Stock>)in.readObject(); 
            setListOfStock(stock);
            in.close();
            fileRead.close();
            /*for(Stock s : stock) {
                listOfStock.add(s);
            }*/
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
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
