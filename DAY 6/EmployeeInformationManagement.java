import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }
    public double getSalary() {
        return salary;
    }
}

public class EmployeeInformationManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();
        employee.setName(name);
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());

        scanner.close();
    }
}