/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dabar;

/**
 *
 * @author user
 */

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection databasekoneksi;
    public static Connection koneksiDB() throws SQLException {
        if (databasekoneksi == null){
            try {
                String DB = "jdbc:mysql://localhost:3306/dabar";
                String user = "root";
                String pass = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                databasekoneksi = (Connection) DriverManager.getConnection(DB,user,pass);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi GAGAL");
            }
            } return databasekoneksi;
        
        }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

