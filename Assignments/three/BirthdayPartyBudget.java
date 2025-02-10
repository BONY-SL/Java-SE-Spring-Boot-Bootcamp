package three;

import java.util.Scanner;

public class BirthdayPartyBudget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create arrays for items and prices
        String[] partyItems = {"Cake", "Balloons", "Party Hats"};
        double[] prices = {20.0, 5.0, 10.0};

        // Step 2: Get user's budget
        System.out.print("Enter your budget: $");
        double budget = scanner.nextDouble();

        // Step 3: Let user select items until budget is exhausted
        while (budget > 0) {
            System.out.println("\nAvailable items:");
            for (int i = 0; i < partyItems.length; i++) {
                System.out.println((i + 1) + ". " + partyItems[i] + " - $" + prices[i]);
            }
            System.out.println("Enter the number of the item you want to purchase (or 0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; // Exit the loop if the user chooses 0
            }

            if (choice >= 1 && choice <= partyItems.length) {
                double itemPrice = prices[choice - 1];
                if (budget >= itemPrice) {
                    budget -= itemPrice;
                    System.out.println("Purchased: " + partyItems[choice - 1]);
                    System.out.printf("Remaining budget: $%.2f\n", budget);
                } else {
                    System.out.println("Not enough budget for this item.");
                }
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }

        System.out.println("Shopping complete. Final budget: $" + budget);
        scanner.close();
    }
}
