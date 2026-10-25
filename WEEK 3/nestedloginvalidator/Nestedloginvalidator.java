/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedloginvalidator;

/**
 *
 * @author caron
 */
import java.util.Scanner;
public class Nestedloginvalidator {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "myUser";
        String correctPassword = "myPassword";

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (username.equals(correctUsername)) {
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }
    }
}