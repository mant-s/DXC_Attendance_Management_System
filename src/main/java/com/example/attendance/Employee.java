package com.example.attendance;

public class Employee {

  int employeeId;
  String employeeName, employeeAddress;

  // Creating Employee
  public void createEmployee(
    int employeeId,
    String employeeName,
    String employeeAddress
  ) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.employeeAddress = employeeAddress;
  }

  // Getters
  public int getEmployeeId() {
    return this.employeeId;
  }

  public String getEmployeeName() {
    return this.employeeName;
  }

  public String getEmployeeAddress() {
    return this.employeeAddress;
  }

  // Setters
  public void setEmployeeId(int newEmployeeId) {
    this.employeeId = newEmployeeId;
  }

  public void setEmployeeName(String newEmployeeName) {
    this.employeeName = newEmployeeName;
  }

  public void setEmployeeAddress(String newEmployeeAddress) {
    this.employeeAddress = newEmployeeAddress;
  }
}
