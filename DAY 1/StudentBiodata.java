import java.util.Scanner;

public class StudentBiodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your course: ");
        String course = scanner.nextLine();

        
        System.out.println("\nStudent Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Course: " + course);
    }
}