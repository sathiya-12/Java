import java.util.Scanner;

final class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public final String getModel() {
        return model;
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        Car myCar = new Car(model);
        System.out.println("Car model: " + myCar.getModel());

        
        scanner.close();
    }
}
