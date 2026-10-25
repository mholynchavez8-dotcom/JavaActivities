/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitcastingconverter;

/**
 *
 * @author caron
 */
public class Unitcastingconverter {


    public static void main(String[] args) {
       
        double centimeters = 358.5;
        int wholeMeters = (int) (centimeters / 100); 
        double remainingCentimeters = centimeters % 100;

        System.out.println("=== Unit Casting Converter ===");
        System.out.println("Original Value: " + centimeters + " cm");
        System.out.println("Whole Meters: " + wholeMeters + " m");
        System.out.println("Remaining Centimeters: " + remainingCentimeters + " cm\n");

       
        int intValue = 50;
        double widenedValue = intValue;
        
       
    }
}