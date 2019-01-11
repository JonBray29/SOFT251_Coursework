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
public class Medicine {
    private String name;
    private static ArrayList<Medicine> listOfMedicine;
    
    private Medicine(String name) {
        this.name = name;
        this.listOfMedicine = new ArrayList<Medicine>();
    }

    public void createMedicine(){
        Medicine medicine = new Medicine(name);
        listOfMedicine.add(medicine);
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
