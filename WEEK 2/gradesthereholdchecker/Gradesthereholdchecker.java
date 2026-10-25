/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradesthereholdchecker;

/**
 *
 * @author caron
 */
public class Gradesthereholdchecker {


    public static void main(String[] args) {
        double averageGrade = 85.0;
        int absences = 2;

        boolean isEligible = (averageGrade >= 75 && absences <= 3) || (averageGrade >= 90);

        System.out.println("Student Average Grade: " + averageGrade);
        System.out.println("Total Absences: " + absences);
        System.out.println("----------------------------------------");

        if (isEligible) {
            System.out.println("Status: PASS");
            if (averageGrade >= 90) {
                System.out.println("Reasoning: Passed based on high academic standing (average >= 90).");
            } else {
                System.out.println("Reasoning: Passed by meeting both standard grade criteria (>= 75) and attendance limits (<= 3 absences).");
            }
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reasoning: Did not meet the minimum average grade requirement of 75, or exceeded the maximum allowed absences of 3.");
        }
    }
}
