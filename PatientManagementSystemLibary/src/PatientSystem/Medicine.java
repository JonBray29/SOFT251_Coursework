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
    
    private Medicine(String name) {
        this.name = name;
    }

    public void createMedicine(){
        Medicine medicine = new Medicine(name);
    }
    
    /*Setters*/
    public void setName(String name) {
        this.name = name;
    }
    
    /*Getters*/
    public String getName() {
        return name;
    }
    
}
