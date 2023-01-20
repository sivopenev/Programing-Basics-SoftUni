package Online_Exam_May_2019;

import java.util.Scanner;

public class _6_Vet_Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int day = scanner.nextInt();
        int hours = scanner.nextInt();
        double daySum = 0;
        double totalSum = 0;

        for (int i = 1; i <= day; i++) {

            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        daySum++;
                        totalSum++;
                    } else {
                        daySum += 2.50;
                        totalSum += 2.50;
                    }

                } else {
                    if (j % 2 == 0) {
                        daySum += 1.25;
                        totalSum += 1.25;
                    }else {
                        daySum++;
                        totalSum++;
                    }
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, daySum);
            daySum = 0;
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
