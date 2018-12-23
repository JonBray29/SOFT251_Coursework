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
public class Stock {
    private Medicine medicine;
    private int quantityInStock;
    private double priceToBuy;
    
    public Stock(Medicine medicine, int quantityInStock, double priceToBuy, double priceToSell) {
        this.medicine = medicine;
        this.quantityInStock = quantityInStock;
        this.priceToBuy = priceToBuy;
    }

    /*Setters*/
    public void setQuantityInStock(int quantityInStock) {
    this.quantityInStock = quantityInStock;
    }
    public void setPriceToBuy(double priceToBuy) {
        this.priceToBuy = priceToBuy;
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
}
