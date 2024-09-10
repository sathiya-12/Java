import java.util.Scanner;

public class model {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area: " + rectangle.area());
                System.out.println("Perimeter: " + rectangle.perimeter());
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area: " + circle.area());
                System.out.println("Perimeter: " + circle.perimeter());
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }
}