package _5_WhileLoop.Excercises;

import java.util.Scanner;

public class _2_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());


        int badGradesCount = 0;
        int solvedProblems = 0;
        double gradesSum = 0;
        String lastProblem = "";
        boolean isFailed = true;


        while (badGradesCount < badGrades) {
            String problem = scanner.nextLine();

            if (problem.equals("Enough")) {
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                badGradesCount++;
            }

            gradesSum += grade;
            solvedProblems++;
            lastProblem = problem;
        }


        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGradesCount);
        } else {
            System.out.printf("Average score: %.2f%n", gradesSum / solvedProblems);
            System.out.printf("Number of problems: %d%n", solvedProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }

    }
}
