package com.example.attendance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// For the data access layer to interact with the Employee table

public class EmployeeDAO {

  // Adding employee to MySQL database
  public void addEmployee(Employee employee) throws SQLException {
    String sqlQuery =
      "INSERT INTO employees (employeeId, employeeName, employeeAddress) VALUES (?, ?, ?)";

    try (
      Connection connection = JdbcUtils.getConnection();
      PreparedStatement statement = connection.prepareStatement(sqlQuery)
    ) {
      statement.setInt(1, employee.getEmployeeId());
      statement.setString(2, employee.getEmployeeName());
      statement.setString(3, employee.getEmployeeAddress());
      statement.executeUpdate();
    }
  }

  // Getting a list of all employees from the database
  public List<Employee> getAllEmployees() throws SQLException {
    String sqlQuery = "SELECT * FROM employees";

    // Creating an ArrayList to store all employees retrieved
    List<Employee> employees = new ArrayList<>();

    try (
      Connection connection = JdbcUtils.getConnection();
      PreparedStatement statement = connection.prepareStatement(sqlQuery)
    ) {
      ResultSet resultSet = statement.executeQuery();

      // Adding each employee to our list
      while (resultSet.next()) {
        Employee employee = new Employee();

        employee.setEmployeeId(resultSet.getInt("employeeId"));
        employee.setEmployeeName(resultSet.getString("employeeName"));
        employee.setEmployeeAddress(resultSet.getString("employeeAddress"));

        employees.add(employee);
      }
    }
    return employees;
  }

  public Employee getEmployeeById(int employeeId) throws SQLException {
    String sqlQuery = "SELECT * FROM employees WHERE employeeId = ?";

    try (
      Connection connection = JdbcUtils.getConnection();
      PreparedStatement statement = connection.prepareStatement(sqlQuery)
    ) {
      statement.setInt(1, employeeId);
      ResultSet resultSet = statement.executeQuery();

      if (resultSet.next()) {
        Employee employee = new Employee();

        employee.setEmployeeId(resultSet.getInt("employeeId"));
        employee.setEmployeeName(resultSet.getString("employeeName"));
        employee.setEmployeeAddress(resultSet.getString("employeeAddress"));

        return employee;
      } else {
        return null;
      }
    }
  }

  public void updateEmployee(Employee employee) throws SQLException {
    String sqlQuery =
      "UPDATE employees SET employeeName = ?, employeeAddress = ? WHERE employeeId = ?";

    try (
      Connection connection = JdbcUtils.getConnection();
      PreparedStatement statement = connection.prepareStatement(sqlQuery)
    ) {
      statement.setString(1, employee.getEmployeeName());
      statement.setString(2, employee.getEmployeeAddress());
      statement.setInt(3, employee.getEmployeeId());

      statement.executeUpdate();
    }
  }

  public void deleteEmployee(int employeeId) throws SQLException {
    String sqlQuery = "DELETE FROM employees WHERE employeeId = ?";

    try (
      Connection connection = JdbcUtils.getConnection();
      PreparedStatement statement = connection.prepareStatement(sqlQuery)
    ) {
      statement.setInt(1, employeeId);
      statement.executeUpdate();
    }
  }
}
