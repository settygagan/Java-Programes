package practice;
//Defining the interface
interface EmpDetails {
 void displayDetails();
}

//Implementing the interface in Employee class
class Employee implements EmpDetails {
 private int empId;
 private String empName;
 private double empSalary;
 private String empLocation;
 private String empPhone;

 // Constructor
 public Employee(int empId, String empName, double empSalary, String empLocation, String empPhone) {
     this.empId = empId;
     this.empName = empName;
     this.empSalary = empSalary;
     this.empLocation = empLocation;
     this.empPhone = empPhone;
 }

 // Implementing displayDetails method
 @Override
 public void displayDetails() {
     System.out.println("Employee Details:");
     System.out.println("Emp ID: " + empId);
     System.out.println("Name: " + empName);
     System.out.println("Salary: " + empSalary);
     System.out.println("Location: " + empLocation);
     System.out.println("Phone: " + empPhone);
 }

 // Main method to test the implementation
 public static void main(String[] args) {
     Employee emp = new Employee(101, "Pawan", 450000.0, "Bangalore", "8310147613");
     emp.displayDetails();
 }
}