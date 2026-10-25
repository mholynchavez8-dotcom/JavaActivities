/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmtransactionauthorizer;

/**
 *
 * @author caron
 */
import java.util.Scanner;
public class Atmtransactionauthorizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUser = "user123";
        int correctPin = 1234;
        double balance = 5000.0;

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter 4-digit PIN: ");
        int pin = scanner.nextInt();

        if (username.equals(correctUser) && pin == correctPin) {
            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter account tier (Bronze/Silver/Gold/Platinum): ");
            scanner.nextLine();
            String tier = scanner.nextLine();

            double dailyLimit = 0.0;
            if (tier.equalsIgnoreCase("Bronze")) {
                dailyLimit = 1000.0;
            } else if (tier.equalsIgnoreCase("Silver")) {
                dailyLimit = 3000.0;
            } else if (tier.equalsIgnoreCase("Gold")) {
                dailyLimit = 5000.0;
            } else if (tier.equalsIgnoreCase("Platinum")) {
                dailyLimit = 10000.0;
            }

            if (amount <= balance && amount <= dailyLimit) {
                int feePercentage = 0;
                switch (tier.toLowerCase()) {
                    case "bronze":
                        feePercentage = 3;
                        break;
                    case "silver":
                        feePercentage = 2;
                        break;
                    case "gold":
                        feePercentage = 1;
                        break;
                    case "platinum":
                        feePercentage = 0;
                        break;
                }
                System.out.println("APPROVE. Transaction fee percentage: " + feePercentage + "%");
            } else {
                System.out.println("DENY. Check balance or daily limit.");
            }
        } else {
            System.out.println("DENY. Invalid credentials.");
        }
    }
}
