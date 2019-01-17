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

    /**
    * creates medicine, useful for when then doctor wants new
    * 
    * @param name name of the medicine
    */
    public static void createMedicine(String name){
        Medicine medicine = new Medicine(name);
        listOfMedicine.add(medicine);
        write();
    }
    
    public static Medicine getMedicine(String name) {
        read();
        Medicine medicine = null;
        for(Medicine m : listOfMedicine){
            if(m.getName().toLowerCase() == name.toLowerCase()){
                medicine = m;
            }
        }
        return medicine;
    }
    
    //Serialization
    public static void write() {
        try {
            FileOutputStream fileWrite = new FileOutputStream("medicine_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(listOfMedicine);
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }

    public static void read(){
        try {
            FileInputStream fileRead = new FileInputStream("medicine_file.ser");
            ObjectInputStream in = new ObjectInputStream(fileRead);
            ArrayList<Medicine> medicine = (ArrayList<Medicine>)in.readObject();       
            in.close();
            fileRead.close();
            setListOfMedicine(medicine);
            /*for(Medicine m : medicine) {
                listOfMedicine.add(m);
            }*/
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
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
