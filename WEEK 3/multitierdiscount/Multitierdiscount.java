/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multitierdiscount;

/**
 *
 * @author caron
 */
public class Multitierdiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double purchaseAmount = 1200.0;
        double discountPercentage = 0.0;
        String discountTier = "";

        if (purchaseAmount < 500) {
            discountPercentage = 0.0;
            discountTier = "Bronze";
        } else if (purchaseAmount >= 500 && purchaseAmount < 1000) {
            discountPercentage = 0.05;
            discountTier = "Silver";
        } else if (purchaseAmount >= 1000 && purchaseAmount < 2000) {
            discountPercentage = 0.10;
            discountTier = "Gold";
        } else {
            discountPercentage = 0.15;
            discountTier = "Platinum";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discountPercentage);
        System.out.println("Tier: " + discountTier);
        System.out.println("Final Discounted Price: " + finalPrice);
    }
}
