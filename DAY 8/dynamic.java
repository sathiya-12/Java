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

public class dynamic {
    public static void printSound(Animal a) {
        a.makeSound();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();

        System.out.println("Select an option:");
        System.out.println("1. Print animal sound");
        System.out.println("2. Print dog sound");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                printSound(myAnimal);
                break;
            case 2:
                printSound(myDog);
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }
}