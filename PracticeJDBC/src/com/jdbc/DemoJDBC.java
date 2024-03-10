package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJDBC {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Do something with the connection (execute queries, updates, etc.)

            // Close the connection when done
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading MySQL JDBC Driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error connecting to the MySQL database: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

