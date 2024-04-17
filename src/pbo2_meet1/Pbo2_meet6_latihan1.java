/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2_meet1;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet6_latihan1 {
    
    public static void main(String[] args) throws Exception {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
        System.out.println("Today's date and time = "+simpleformat.format(cal.getTime()));
        
        Format f = new SimpleDateFormat("MM/dd/yy");
        String strDate = f.format(new Date());
        System.out.println("Current Date = "+strDate);
        
        f = new SimpleDateFormat("HH.mm.ss Z");
        String strTime = f.format(new Date());
        System.out.println("Current Time = "+strTime);
        
        f = new SimpleDateFormat("H");
        String strHour = f.format(new Date());
        System.out.println("Current Hour = "+strHour);
        
        f = new SimpleDateFormat("mm");
        String strMinute = f.format(new Date());
        System.out.println("Current Minutes = "+strMinute);
        
        f = new SimpleDateFormat("ss");
        String strSeconds = f.format(new Date());
        System.out.println("Current Seconds = "+strSeconds);
    }
}
