package _2_ConditionalStatements.Lab;

import java.util.Scanner;

public class _1_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent");
        } else {
            System.out.println("Average");
        }
    }
}
