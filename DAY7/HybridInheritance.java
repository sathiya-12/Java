import java.util.Scanner;

abstract class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

abstract class FourWheeler extends Vehicle {
    int numberOfDoors;

    public FourWheeler(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }
}

abstract class TwoWheeler extends Vehicle {
    boolean hasCarrier;

    public TwoWheeler(String make, String model, boolean hasCarrier) {
        super(make, model);
        this.hasCarrier = hasCarrier;
    }
}

class Car extends FourWheeler {
    public Car(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
    }

    public void printProperties() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends TwoWheeler {
    public Bike(String make, String model, boolean hasCarrier) {
        super(make, model, hasCarrier);
    }

    public void printProperties() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter number of doors: ");
        int carDoors = scanner.nextInt();
        Car car = new Car(carMake, carModel, carDoors);
        car.printProperties();

        System.out.print("Enter bike make: ");
        String bikeMake = scanner.next();
        System.out.print("Enter bike model: ");
        String bikeModel = scanner.next();
        System.out.print("Has carrier (true/false): ");
        boolean bikeCarrier = scanner.nextBoolean();
        Bike bike = new Bike(bikeMake, bikeModel, bikeCarrier);
        bike.printProperties();
    }
}
