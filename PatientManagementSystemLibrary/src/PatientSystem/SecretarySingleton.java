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
public class SecretarySingleton {
    
    private static SecretarySingleton instance;
    private ArrayList<SystemUsers> listOfSecretarys = null;

    private SecretarySingleton() {
        listOfSecretarys = new ArrayList<SystemUsers>();
    }
    
    public static SecretarySingleton getInstance() {
        if(instance == null) {
            instance = new SecretarySingleton();
        }    
        return instance;
    }

    public ArrayList<SystemUsers> getListOfSecretarys() {
        return listOfSecretarys;
    }

}
