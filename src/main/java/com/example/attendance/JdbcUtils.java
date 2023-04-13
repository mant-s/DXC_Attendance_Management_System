package com.example.attendance;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Creating a connection to the MySQL database using JDBC API

public class JdbcUtils {

  static Dotenv dotenv = Dotenv.configure().directory("../").load();
  private static final String dbUsername = dotenv.get("DB_USERNAME");
  private static final String dbPassword = dotenv.get("DB_PASSWORD");
  private static final String dbUrl = "jdbc:mysql://localhost:3306/dxcDB";

  public static void main(String[] args) {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jbdc.Driver");

      // connection object for executing MySQL queries
      connection = getConnection();
      System.out.println("Successfully connected to database!");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException err) {
      err.printStackTrace();
    } finally {
      if (connection != null) {
        try {
          // Closing connection to MySQL database
          connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }

  public static Connection getConnection() throws SQLException {
    Connection connection = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return connection;
  }
}
