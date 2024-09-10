import java.util.Scanner;

class Employee {
    // Fields for employee details
    String name;
    int id;
    double basicSalary;
    double allowances;

    // Default constructor
    Employee() {}

    // Parameterized constructor to initialize employee details
    Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    // Method to calculate gross salary
    double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    // Method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println();
    }
}

public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of employees
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Check if there are employees to manage
        if (numEmployees <= 0) {
            System.out.println("No employees to manage.");
            return;
        }

        // Create an array to store multiple employees
        Employee[] employees = new Employee[numEmployees];

        // Get details of each employee from the user
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Initialize the employee object with the details provided
            employees[i] = new Employee(name, id, basicSalary, allowances);
        }

        // Calculate and display the gross salary for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Details of employee " + (i + 1) + ":");
            employees[i].displayEmployeeDetails();
        }

        scanner.close();
    }
}