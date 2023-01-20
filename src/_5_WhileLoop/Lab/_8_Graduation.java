package _5_WhileLoop.Lab;

import java.util.Scanner;

public class _8_Graduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int grade = 1;
        int poorGradesCount = 0;
        double grades = 0;
        boolean isExcluded = false;


        while (grade <= 12) {

            if (poorGradesCount == 2) {
                isExcluded = true;
                break;
            }


            double currentGrade = Double.parseDouble(scanner.nextLine());
            grades += currentGrade;

            if (currentGrade < 4) {

                poorGradesCount++;

            }
            grade++;
        }


        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade", name, (grade - 2));
        } else {

            System.out.printf("%s graduated. Average grade: %.2f ", name, grades / 12);
        }

    }
}
