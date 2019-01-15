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
public class Medicine implements Serializable{
    private String name;
    private static ArrayList<Medicine> listOfMedicine  = new ArrayList<Medicine>();
    
    private Medicine(String name) {
        this.name = name;
    }

    public void createMedicine(String name){
        Medicine medicine = new Medicine(name);
        listOfMedicine.add(medicine);
        write(medicine);
    }
    
    //Serialization
    public static void write(Medicine medicine) {
        Serialiser.writeObject(medicine, "medicine_file.ser");
    }

    public static Serializable read(){
        Serializable medicine = null;
        try {
         FileInputStream fileRead = new FileInputStream("medicine_file.ser");
         ObjectInputStream in = new ObjectInputStream(fileRead);
         while(fileRead.available() > 0) {
            medicine = (Serializable) in.readObject();
            listOfMedicine.add((Medicine) medicine);        
        }
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return medicine;
    }   
    
    /*Setters*/
    public void setName(String name) {
        this.name = name;
    }
    public static void setListOfMedicine(ArrayList<Medicine> listOfMedicine) {
        Medicine.listOfMedicine = listOfMedicine;
    }
       
    /*Getters*/
    public String getName() {
        return name;
    }
    public static ArrayList<Medicine> getListOfMedicine() {
        return listOfMedicine;
    }
    
}
