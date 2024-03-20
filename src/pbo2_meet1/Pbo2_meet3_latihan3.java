/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2_meet1;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet3_latihan3 {
    public static void main(String[] args) {
        // Hashtable Obsolete Collection, try using HashMap
        Dictionary geek = new Hashtable();
        
        geek.put("123", "Code");
        geek.put("456", "Program");
        
        for(Enumeration i = geek.elements(); i.hasMoreElements();) {
            System.out.println("Value in Dictionary: " + i.nextElement());
        }
        
        System.out.println("\nValue at key = 6 : " + geek.get("6"));
        System.out.println("Value at key = 456 : " + geek.get("123")); 
        
        System.out.println("\nThere is no key-value pair : " + geek.isEmpty() + "\n");
        
        for (Enumeration k = geek.keys(); k.hasMoreElements();) {
            System.out.println("Keys in Dictionary : " + k.nextElement());
        }
        
        System.out.println("\nRemove : " + geek.remove("123"));
        System.out.println("Check the value of removed key : " + geek.get("123"));
        
        System.out.println("\nSize of Dictionary : " + geek.size()); 
    }
}
