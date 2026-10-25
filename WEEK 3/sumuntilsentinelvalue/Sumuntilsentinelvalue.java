/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumuntilsentinelvalue;

/**
 *
 * @author caron
 */
import java.util.Scanner;
public class Sumuntilsentinelvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        while (input != -1) {
            System.out.print("Enter number (-1 to stop): ");
            input = scanner.nextInt();
            if (input != -1) {
                sum += input;
            }
        }

        System.out.println("Final Total: " + sum);
    }
}