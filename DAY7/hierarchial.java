import java.util.Scanner;

class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void printProperties() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    String type;

    public Bike(String make, String model, String type) {
        super(make, model);
        this.type = type;
    }

    public void printProperties() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
    }
}

public class hierarchial {
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
        System.out.print("Enter bike type: ");
        String bikeType = scanner.next();
        Bike bike = new Bike(bikeMake, bikeModel, bikeType);
        bike.printProperties();
    }
}