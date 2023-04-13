package com.example.attendance;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;

public class JdbcUtilsTest {

  @Test
  public void testConnection() throws SQLException {
    Connection connection = null;
    try {
      connection = JdbcUtils.getConnection();
      assertNotNull(connection);
      assertFalse(connection.isClosed());
    } finally {
      if (connection != null) {
        connection.close();
      }
    }
  }
}
