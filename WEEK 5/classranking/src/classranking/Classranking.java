/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classranking;

/**
 *
 * @author caron
 */
public class Classranking {

    /**
     * @param args the command line arguments
     */
    static class Student {
        private String name;
        private double[] quizzes;

        public Student(String name, double[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        public String getName() {
            return name;
        }

        public double[] getQuizzes() {
            return quizzes;
        }

        public double getAverage() {
            double sum = 0;
            for (double score : quizzes) {
                sum += score;
            }
            return quizzes.length > 0 ? sum / quizzes.length : 0;
        }
    }

    public static void main(String[] args) {
        String[] names = {"Maxine", "Gochi", "Marriel", "Rhinel", "CJ"};
        
        double[][] rawQuizData = {
            {85.0, 90.0, 88.0, 92.0},
            {95.0, 92.0, 98.0, 94.0},
            {70.0, 80.0, 75.0, 85.0},
            {95.0, 92.0, 98.0, 94.0},
            {88.0, 85.0, 90.0, 87.0}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        sortStudentsByAverageDescending(students);

        System.out.println("================ LEADERBOARD ================");
        System.out.printf("%-6s %-12s %-10s%n", "Rank", "Name", "Average");
        System.out.println("---------------------------------------------");

        int[] ranks = new int[students.length];
        if (students.length > 0) {
            ranks[0] = 1;
            for (int i = 1; i < students.length; i++) {
                if (students[i].getAverage() == students[i - 1].getAverage()) {
                    ranks[i] = ranks[i - 1];
                } else {
                    ranks[i] = i + 1;
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-6d %-12s %-10.2f%n", ranks[i], students[i].getName(), students[i].getAverage());
        }
        System.out.println("=============================================\n");

        String searchTarget = "David";
        int foundRank = linearSearchRank(students, ranks, searchTarget);

        if (foundRank != -1) {
            System.out.println("Search Result: " + searchTarget + " is ranked #" + foundRank);
        } else {
            System.out.println("Search Result: " + searchTarget + " was not found.");
        }
    }

    public static void sortStudentsByAverageDescending(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getAverage() > students[maxIdx].getAverage()) {
                    maxIdx = j;
                }
            }
            Student temp = students[maxIdx];
            students[maxIdx] = students[i];
            students[i] = temp;
        }
    }

    public static int linearSearchRank(Student[] students, int[] ranks, String targetName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equalsIgnoreCase(targetName)) {
                return ranks[i];
            }
        }
        return -1;
    }
}
