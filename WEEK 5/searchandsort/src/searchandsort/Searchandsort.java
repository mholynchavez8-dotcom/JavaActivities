/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searchandsort;

/**
 *
 * @author caron
 */
import java.util.Arrays;
public class Searchandsort {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 82};
        int target = 90;

        // Linear Search
        boolean found = false;
        int targetIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                found = true;
                targetIndex = i;
                break;
            }
        }

        if (found) {
            System.out.println("Target " + target + " found at index " + targetIndex + ".");
        } else {
            System.out.println("Target " + target + " was not found.");
        }

        // Sorting a COPY of the array
        // Sorting a copy ensures the original array structure and data order remain intact,
        // preventing accidental side effects in other parts of the program that rely on original indices.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(sortedScores));
    }
}
