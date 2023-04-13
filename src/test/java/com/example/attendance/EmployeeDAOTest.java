// package com.example.attendance;

// import java.sql.SQLException;
// import java.util.List;

// public class EmployeeDAOTest {

//   public static void main(String[] args) {
//     try {
//       // Creating a new EmployeeDAO object
//       EmployeeDAO dao = new EmployeeDAO();

//       // Adding a new employee to the database
//       Employee newEmployee = new Employee();
//       newEmployee.createEmployee(101, "John Doe", "Block 123 Bishan St 13");
//       dao.addEmployee(newEmployee);

//       // Getting all employees from the database and printing them
//       List<Employee> employees = dao.getAllEmployees();
//       System.out.println("All Employees:");
//       for (Employee employee : employees) {
//         System.out.println(employee);
//         System.out.println(employee.getEmployeeId());
//         System.out.println(employee.getEmployeeName());
//         System.out.println(employee.getEmployeeAddress());
//       }

//       // Updating an existing employee's name and address
//       Employee existingEmployee = dao.getEmployeeById(101);
//       existingEmployee.setEmployeeName("Jane Doe");
//       existingEmployee.setEmployeeAddress("Block 456 Toa Payoh St 13");
//       dao.updateEmployee(existingEmployee);

//       // Getting the updated employee by ID and printing their information
//       Employee updatedEmployee = dao.getEmployeeById(101);
//       System.out.println("Updated Employee: " + updatedEmployee);
//       System.out.println(updatedEmployee.getEmployeeId());
//       System.out.println(updatedEmployee.getEmployeeName());
//       System.out.println(updatedEmployee.getEmployeeAddress());

//       // Deleting an employee from the database
//       dao.deleteEmployee(101);

//       // Getting all employees from the database and printing them again
//       List<Employee> remainingEmployees = dao.getAllEmployees();
//       System.out.println("Remaining Employees:");
//       for (Employee employee : remainingEmployees) {
//         System.out.println(employee);
//       }
//     } catch (SQLException e) {
//       e.printStackTrace();
//     }
//   }
// }
