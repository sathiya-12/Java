class Item {
    private String name;
    private double price;
    private static int totalItemsSold = 0;
    private static double totalRevenue = 0.0;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void sell(int quantity) {
        totalItemsSold += quantity;
        totalRevenue += price * quantity;
    }

    public static int getTotalItemsSold() {
        return totalItemsSold;
    }

    public static double getTotalRevenue() {
        return totalRevenue;
    }
}

public class OnlineStore {
    public static void main(String[] args) {
        // Test Case 1: Basic Sale
        Item laptop = new Item("Laptop", 1000.0);
        laptop.sell(2);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        // Test Case 2: Multiple Item Sale
        Item smartphone = new Item("Smartphone", 500.0);
        laptop.sell(3);
        smartphone.sell(5);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        // Test Case 3: No Sales
        Item newLaptop = new Item("Laptop", 1000.0);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        // Test Case 4: Mixed Item Sale
        laptop.sell(1);
        smartphone.sell(4);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());

        // Test Case 5: Large Quantity Sale
        Item bulkLaptops = new Item("Laptop", 1000.0);
        bulkLaptops.sell(100);
        System.out.println("Total Items Sold: " + Item.getTotalItemsSold());
        System.out.println("Total Revenue: $" + Item.getTotalRevenue());
    }
}