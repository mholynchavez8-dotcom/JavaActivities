/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precedencepuzzlesolver;

/**
 *
 * @author caron
 */
public class Precedencepuzzlesolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 4;
        int y = 12;
        int z = 3;

        System.out.println("--- Precedence Expression Evaluations ---\n");

        // Expression 1
        // PREDICTED: true
        boolean expr1 = x + y * z > 40 && y - z == 9;
        System.out.println("Expression 1 Result: " + expr1);

        // Expression 2
        // PREDICTED: 40
        int expr2 = x + y++ * z;
        System.out.println("Expression 2 Result: " + expr2);

        // Expression 3
        // PREDICTED: true
        boolean expr3 = !(x > y) || y > 15 && x == 0;
        System.out.println("Expression 3 Result: " + expr3);
    }
}
