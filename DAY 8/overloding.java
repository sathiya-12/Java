import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class overloding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Sum: " + calculator.add(a, b));

        System.out.print("Enter first integer: ");
        int x = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int y = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int z = scanner.nextInt();
        System.out.println("Sum: " + calculator.add(x, y, z));

        System.out.print("Enter first double value: ");
        double c = scanner.nextDouble();
        System.out.print("Enter second double value: ");
        double d = scanner.nextDouble();
        System.out.println("Sum: " + calculator.add(c, d));

        scanner.close();
    }
}