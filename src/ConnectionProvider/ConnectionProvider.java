/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author swati
 */
public class ConnectionProvider {
    public Connection con;
    public static Connection getCon() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem", "root", "swati@123");
           return con;
        } catch(Exception e) {
           JOptionPane.showMessageDialog(null, e.toString()); 
           return null; 
        }
    }
    public static void main(String[] args) {
        
    }
}
