/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2_meet1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet6_latihan4 {
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public static void main(String[] args) throws Exception {
        Date date = new Date();
        System.out.println(sdf.format(date));
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
    }
}
