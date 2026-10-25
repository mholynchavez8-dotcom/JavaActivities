/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compoundgrowthtracker;

/**
 *
 * @author caron
 */
public class Compoundgrowthtracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double balance = 1000.0;
        System.out.println("Initial Balance: $" + balance);

        balance += 250.0;
        System.out.println("After deposit (+= $250): $" + balance);

        balance *= 1.05;
        System.out.println("After interest (*= 1.05): $" + balance);

        balance += 100.0;
        System.out.println("After final deposit (+= $100): $" + balance);

        System.out.println("\n--- Increment Operator Comparison ---");

        int count = 10;
        System.out.println("Postfix increment execution (count++): " + (count++));
        System.out.println("Value of count immediately after postfix: " + count);

        count = 10;
        System.out.println("Prefix increment execution (++count): " + (++count));
        System.out.println("Value of count immediately after prefix: " + count);
    }
}