/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author giorg
 */
public class DatabaseConnect {

    static Connection conn = null;

    public static Connection connectDB() {
        if(conn!=null)
        {
            return conn;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Error loading driver");
            return null;
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingapp", "swingapp", "swingapp");
            return conn;
        } catch (SQLException e) {
            System.out.println("Error connection to database");
            return null;
        }

    }
}
