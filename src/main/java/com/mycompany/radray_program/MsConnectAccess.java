/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package com.mycompany.radray_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author CL2-PC
 */
public class MsConnectAccess {
    public static Connection conn() {
        try {
            String url = "jdbc:ucanaccess:";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
}
    
    public static Connection getConnection() {

        Connection conn = null;

        try {
            String url = "jdbc:ucanaccess://C://Users//amald//OneDrive//Documents/ayuro.accdb";
            //"jdbc:ucanaccess://C://Users//CL2-PC//Documents//rochie.accdb"

            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.out.println("Database Connection Error: " + e.getMessage());
        }

        return conn;
    }
}
