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

import java.io.*;

public class Serialiser {
    
    public static void writeObject(Serializable object, String fileName){
        try {
            FileOutputStream fileWrite = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(fileWrite);
            out.writeObject(object);
            out.close();
            fileWrite.close();
         } catch (IOException i) {
            i.printStackTrace();
         }
    }
    
    public static Serializable readObject(String fileName){
        Serializable loadedObject = null;
        try {
         FileInputStream fileRead = new FileInputStream(fileName);
         ObjectInputStream in = new ObjectInputStream(fileRead);
         loadedObject = (Serializable) in.readObject();
         in.close();
         fileRead.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return loadedObject;
    }
}
