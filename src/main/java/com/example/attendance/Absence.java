package com.example.attendance;

import java.util.Date;

public class Absence {

  String employeeId;
  Date absentDate;

  // Creating an Absence
  public void createAbsence(String employeeId, Date absentDate) {
    this.employeeId = employeeId;
    this.absentDate = absentDate;
  }

  // Getters
  public String getEmployeeId() {
    return this.employeeId;
  }

  public Date getAbsentDate() {
    return this.absentDate;
  }

  // Setters
  public void setEmployeeId(String newEmployeeId) {
    this.employeeId = newEmployeeId;
  }

  public void setAbsenceDate(Date newAbsentDate) {
    this.absentDate = newAbsentDate;
  }
}
