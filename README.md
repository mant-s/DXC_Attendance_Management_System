# Partially Completed 'Attendance Management System' Technical Assessment

Built using JSP, Maven, Tomcat, and MySQL.
<br/>

## Completed files

#### Backend

- Absence.java
  Includes Setters and Getters for absences.
- Employee.java
  Includes Setters and Getters for employees.
- EmployeeDAO.java
  Runs CRUD queries to MySQL server based on Employees' data.
- JdbcUtils.java
  Establishes connection with MySQL server.

#### Frontend

- index.jsp
  Currently contains a very basic layout.
- addEmployee.jsp
  Contains a form for creating and adding employees.
- addAbsence.jsp
  Contains a form for creating and adding absences.
- header.jsp

<br/>

## Uncomplete files

#### Backend

- AbsenceDAO.java
  Runs CRUD queries to MySQL server based on Absences' data.
- Attendance Service.java
  Interacts with the data access layer to perform CRUD operations.
- Attendance Servlet.java
  Handles HTTP requests and responses and interacts with the AttendanceService to store data in the MySQL database.
- App.java
  Contains the main java code.

#### Frontend

- listing.jsp
  To display a page with all Employees' information with details of Absences.
- style.css
- footer.jsp

<br/>

## Completed tests

- Frontend tests for completed files
- JdbcUtils.java
- EmployeeDAO.java
- Employee.java

<br/>

## MySQL setup

- localhost used
- created 'dxcDB' schema containing
  - 'employees' table
  - 'absences' table
