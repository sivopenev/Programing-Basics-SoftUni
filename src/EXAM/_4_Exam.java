package EXAM;

import java.util.Scanner;

public class _4_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = Integer.parseInt(scanner.nextLine());

        int topStudent = 0;
        int goodStudent = 0;
        int mediumStudents = 0;
        int failStudents = 0;
        double grades = 0;


        for (int i = 1; i <= studentCount; i++) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade <= 2.99) {
                failStudents++;
            } else if (currentGrade <= 3.99) {
                mediumStudents++;
            } else if (currentGrade <= 4.99) {
                goodStudent++;
            } else if (currentGrade >= 5) {
                topStudent++;
            }

            grades += currentGrade;

        }
        double topStudentsPercent = 1.0 * topStudent / studentCount * 100;
        double goodStudentPercent = 1.0 * goodStudent / studentCount * 100;
        double mediumStudentPercent = 1.0 * mediumStudents / studentCount * 100;
        double failedStudentPercent = 1.0 * failStudents / studentCount * 100;
        double averageGrades = (grades / studentCount);
        System.out.printf("Top students: %.2f%%\n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodStudentPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", mediumStudentPercent);
        System.out.printf("Fail: %.2f%%\n", failedStudentPercent);
        System.out.printf("Average: %.2f", averageGrades);
    }
}
