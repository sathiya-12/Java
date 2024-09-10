import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
       public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        System.out.println("Select an option:");
        System.out.println("1. Make animal sound");
        System.out.println("2. Make dog sound");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                myAnimal.makeSound();
                break;
            case 2:
                myDog.makeSound();
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }
}