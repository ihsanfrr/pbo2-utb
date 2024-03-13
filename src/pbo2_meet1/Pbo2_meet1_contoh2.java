/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2_meet1;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet1_contoh2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        
        SpringLayout layout = new SpringLayout();
        contentPane.setLayout(layout);
        
        Component left = new JLabel("Nama");
        Component right = new JTextField(15);
        contentPane.add(left);
        contentPane.add(right);
        
        layout.putConstraint(SpringLayout.WEST, left, 10, SpringLayout.WEST, contentPane);
        
        layout.putConstraint(SpringLayout.NORTH, left, 25, SpringLayout.NORTH, contentPane);
        
        layout.putConstraint(SpringLayout.NORTH, right, 25, SpringLayout.NORTH, contentPane);
        
        layout.putConstraint(SpringLayout.WEST, right, 20, SpringLayout.EAST, left);
        
        frame.setSize(300, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
