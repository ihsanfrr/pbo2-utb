/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2_meet1;

import java.util.*;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet6_latihan2 {
    public static void main(String[] args) throws Exception {
        Calendar c1 = Calendar.getInstance();
        
        c1.set(Calendar.MONTH, 11);
        c1.set(Calendar.DATE, 27);
        c1.set(Calendar.YEAR, 2002);
        Date dateOne = c1.getTime();
        
        System.out.println("Date: " + dateOne);
        System.out.println(dateOne.getTime());
    }
}
