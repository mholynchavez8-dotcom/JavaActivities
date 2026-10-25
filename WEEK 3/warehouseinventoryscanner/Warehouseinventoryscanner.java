/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warehouseinventoryscanner;

/**
 *
 * @author caron
 */
import java.util.Scanner;
public class Warehouseinventoryscanner {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] inventory = {
            {10, 20, 30},
            {40, -1, 60},
            {70, 80, 90}
        };

        int choice;
        do {
            System.out.println("\n1. Total Inventory");
            System.out.println("2. Find Critical Shelf");
            System.out.println("3. Restock");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int total = 0;
                    for (int[] shelf : inventory) {
                        for (int item : shelf) {
                            if (item == -1) {
                                continue;
                            }
                            total += item;
                        }
                    }
                    System.out.println("Total Inventory: " + total);
                    break;

                case 2:
                    boolean found = false;
                    for (int i = 0; i < inventory.length; i++) {
                        for (int j = 0; j < inventory[i].length; j++) {
                            if (inventory[i][j] != -1 && inventory[i][j] < 15) {
                                System.out.println("Low stock found at shelf " + i + ", position " + j);
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                    break;

                case 3:
                    int restockInput;
                    while (true) {
                        System.out.print("Enter restock amount (greater than 0): ");
                        restockInput = scanner.nextInt();
                        if (restockInput > 0) {
                            break;
                        }
                    }
                    inventory[0][0] += restockInput;
                    System.out.println("Restocked successfully.");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 4);
    }
}