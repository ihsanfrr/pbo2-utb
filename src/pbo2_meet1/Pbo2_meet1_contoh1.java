/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2_meet1;

import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JFrame;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet1_contoh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Contoh Program Swing");
        
        Label myLabel = new Label("Selamat Belajar JAVA!");
        
        myFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        
        myFrame.add(myLabel);
        myFrame.setSize(200, 150);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);  
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
