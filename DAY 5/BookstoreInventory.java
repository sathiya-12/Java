import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    int numCopies;

    public Book(String title, String author, double price, int numCopies) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.numCopies = numCopies;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
        System.out.println("Number of Copies: " + numCopies);
    }
}

public class BookstoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            System.out.print("Enter book price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter number of copies: ");
            int numCopies = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            books[i] = new Book(title, author, price, numCopies);
        }

        System.out.println("Books in the inventory:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
