/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcalculator;

/**
 *
 * @author caron
 */
public class Shoppingcalculator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        String storeName = "Supermart";
        int quantity = 3;
        double unitPrice = 12.99;
        double totalCost = quantity * unitPrice;

       
        System.out.println("=== Shopping Summary ===");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);

       
    }
}