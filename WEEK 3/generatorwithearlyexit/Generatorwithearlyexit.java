/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generatorwithearlyexit;

/**
 *
 * @author caron
 */
public class Generatorwithearlyexit {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
