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
public class Medicine {
    private String name;
    private int quantityInStock;
    private double priceToBuy;
    private double priceToSell;
    
    public Medicine(String name, int quantityInStock, double priceToBuy, double priceToSell) {
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.priceToBuy = priceToBuy;
        this.priceToSell = priceToSell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getPriceToBuy() {
        return priceToBuy;
    }

    public void setPriceToBuy(double priceToBuy) {
        this.priceToBuy = priceToBuy;
    }

    public double getPriceToSell() {
        return priceToSell;
    }

    public void setPriceToSell(double priceToSell) {
        this.priceToSell = priceToSell;
    }
    
    
}
