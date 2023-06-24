/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddeliveryapp;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;


public class DBConnector {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public DBConnector() {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/fooddelivery1","root","");
        
        stmt=con.createStatement();
        rs=stmt.executeQuery("select * from restaurant");
        
    }catch(Exception e){
        System.out.println(e.toString());
    }
    
    
    }

    public ResultSet getRs() {
        return rs;
    }
    
    
    
}

