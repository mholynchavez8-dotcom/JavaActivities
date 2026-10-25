/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package publicclassfavoritethings;

/**
 *
 * @author caron
 */
public class Publicclassfavoritethings {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        String[] favorites = {"Pizza", "Gamer PC", "Coffee", "Books", "Music"};

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total items: " + favorites.length);
    }
}
