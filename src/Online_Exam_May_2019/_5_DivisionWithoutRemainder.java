package Online_Exam_May_2019;

import java.util.Scanner;

public class _5_DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int iterations = Integer.parseInt(scanner.nextLine());

        double dividedBy2 = 0;
        double dividedBy3 = 0;
        double dividedBy4 = 0;

        for (int i = 0; i < iterations; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                dividedBy2++;
            }
            if (number % 3 == 0) {
                dividedBy3++;
            }
            if (number % 4 == 0) {
                dividedBy4++;
            }


        }
        double p1 = dividedBy2 / iterations * 100;
        double p2 = dividedBy3 / iterations * 100;
        double p3 = dividedBy4 / iterations * 100;
        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
    }
}
