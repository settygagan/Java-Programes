package practice;
import java.util.Scanner;

interface EmpDetails {
    void displayDetails();
}

class Employee implements EmpDetails {
    private int empId;
    private String empName;
    private double empSalary;
    private String empLocation;
    private String empPhone;

    public Employee(int empId, String empName, double empSalary, String empLocation, String empPhone) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
        this.empPhone = empPhone;
    }

    @Override
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Emp ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + empSalary);
        System.out.println("Location: " + empLocation);
        System.out.println("Phone: " + empPhone);
    }
}

public class Employee01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Employee Location: ");
        String empLocation = sc.nextLine();

        System.out.print("Enter Employee Phone: ");
        String empPhone = sc.nextLine();

        Employee emp = new Employee(empId, empName, empSalary, empLocation, empPhone);
        emp.displayDetails();

        sc.close();
    }
}
