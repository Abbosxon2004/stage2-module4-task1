package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2ConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        Connection connection = null;

        // Load properties from file
        Properties props = new Properties();
        try {
            props.load(getClass().getResourceAsStream("/h2database.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get the JDBC driver class
        String driver = props.getProperty("jdbc_driver");
        if (driver != null) {
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Get the URL, username, and password for the database connection
        String url = props.getProperty("db_url");
        String username = props.getProperty("user");
        String password = props.getProperty("password");

        try {
            // Create the database connection
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}