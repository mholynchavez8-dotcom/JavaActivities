/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overflowandreferenceinvestigator;

/**
 *
 * @author caron
 */
import java.util.Arrays;
public class Overflowandreferenceinvestigator {

    
    public static void main(String[] args) {
        
       
        byte maxByte = 127; // Maximum value for a signed 8-bit byte
        System.out.println("=== 1. Primitive Overflow ===");
        System.out.println("Initial byte value: " + maxByte);
        
       
        byte overflowedByte = (byte) (maxByte + 1);
        System.out.println("After incrementing by 1 (Overflow): " + overflowedByte + "\n");


        String strLiteral1 = "Hello";
        String strObject1 = new String("Hello");
        String strObject2 = new String("Hello");

        System.out.println("=== 2. String Comparisons ===");
        System.out.println("strLiteral1 == strObject1: " + (strLiteral1 == strObject1));
        System.out.println("strObject1 == strObject2: " + (strObject1 == strObject2)); 
    
        System.out.println("strLiteral1.equals(strObject1): " + strLiteral1.equals(strObject1));
        System.out.println("strObject1.equals(strObject2): " + strObject1.equals(strObject2) + "\n");
        
        int[] originalArray = {10, 20, 30};
        
       
        int[] sharedArray = originalArray; 

        System.out.println("Before modification:");
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("sharedArray:   " + Arrays.toString(sharedArray));

        // Modifying the data through the second reference variable
        sharedArray[0] = 999;

        System.out.println("\nAfter modifying sharedArray[0] to 999:");
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("sharedArray:   " + Arrays.toString(sharedArray));

       
    }
}