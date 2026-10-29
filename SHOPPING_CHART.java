import java.util.Scanner;

public class SHOPPING_CHART {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart!");

        System.out.print("Enter the number of items you want to add to the cart: ");
        int totalItems = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        double totalCost = 0.0;

        // Loop continuously for each item
        for (int i = 1; i <= totalItems; i++) {
            System.out.println("\n--- Enter details for item " + i + " ---");
            
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();

            System.out.print("Enter item quantity: ");
            int itemQuantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline after nextInt()

            double itemTotal = itemPrice * itemQuantity;
            totalCost += itemTotal;

            System.out.println("Added: " + itemQuantity + "x " + itemName + " - $" + itemTotal);
        }

        System.out.println("\n========================================");
        System.out.println("Total cost of all items in the cart: $" + totalCost);
        System.out.println("========================================");

        scanner.close();
    }
}