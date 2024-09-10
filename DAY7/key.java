import java.util.Scanner;

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }
}

interface AbstractClass {
    void display();
}

class Child extends Parent implements AbstractClass {
    public Child(String name) {
        super(name);
    }

    
    public void display() { 
        System.out.println("Name: " + name);
    }
}

public class key {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        Child child = new Child(name);
        child.display();
        scanner.close();
    }
}