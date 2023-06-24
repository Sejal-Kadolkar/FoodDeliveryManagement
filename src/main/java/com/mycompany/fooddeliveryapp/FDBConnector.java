/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fooddeliveryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author sejal
 */
public class FDBConnector {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    /**
     *
     */
    public FDBConnector() {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/fooddelivery1","root","");
        
        stmt=con.createStatement();
        rs=stmt.executeQuery("select * from fooditem");
        
    }catch(Exception e){
        System.out.println(e.toString());
    }
    
    
    }

    public ResultSet getRs() {
        return rs;
    }
    
    
    
}
