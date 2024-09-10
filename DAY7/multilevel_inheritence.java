import java.util.Scanner;

class animal {
    String spicesName;

    public animal(String spicesName) {
        this.spicesName = spicesName;
    }
}

class mammel extends animal {
    boolean fur;

    public mammel(String spicesName, boolean fur) {
        super(spicesName);
        this.fur = fur;
    }
}

class Dog extends mammel {
    String breed;

    public Dog(String spicesName, boolean fur, String breed) {
        super(spicesName, fur);
        this.breed = breed;
    }

    public void display() {
        System.out.println("SPICES NAME: " + spicesName);
        System.out.println("FUR: " + fur);
        System.out.println("BREED: " + breed);
    }
}

public class multilevel_inheritence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter spices name: ");
        String spicesName = scanner.nextLine();

        System.out.print("Do they have fur (true/false): ");
        boolean fur = scanner.nextBoolean();

        System.out.print("Enter breed name: ");
        String breed = scanner.next();

        Dog dog = new Dog(spicesName, fur, breed);
        dog.display();

        scanner.close();
    }
}