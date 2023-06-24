/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fooddeliveryapp;

import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;

public class FoodDeliveryApp {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                JFrame myFrame = new MyFrame();
                
                myFrame.setVisible(true);
                
            }
        
        });
       
    }
}
