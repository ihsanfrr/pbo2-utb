/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2_meet1;

import java.util.Hashtable;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet3_latihan4 {
    public static void main(String[] args) {
        // Hashtable Obsolete Collection, try using HashMap
        Hashtable<Integer, String> hashTable = 
                new Hashtable<Integer, String>();
        
        hashTable.put(10, "Geeks");
        hashTable.put(15, "4");
        hashTable.put(20, "Geeks");
        hashTable.put(25, "Welcomes");
        hashTable.put(30, "You");
        
        System.out.println("Initial Table is: " + hashTable);
        
        System.out.println("Is the value 'Geeks' present? " 
                + hashTable.contains("Geeks"));
        
        System.out.println("Is the value 'World' present? " 
                + hashTable.contains("World"));
    }
}
