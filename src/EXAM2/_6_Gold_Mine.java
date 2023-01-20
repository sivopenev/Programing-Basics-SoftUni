package EXAM2;

import java.util.Scanner;

public class _6_Gold_Mine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int locationsAmount = Integer.parseInt(scanner.nextLine());

        for (int locations = 0; locations < locationsAmount; locations++) {

            double expectedGoldPerDay = Double.parseDouble(scanner.nextLine());
            int daysAtLocation = Integer.parseInt(scanner.nextLine());
            double totalGold = 0;

            for (int days = 0; days < daysAtLocation; days++) {
                double goldForDay = Double.parseDouble(scanner.nextLine());
                totalGold += goldForDay;
            }

            double average = totalGold / daysAtLocation;

            if (average >= expectedGoldPerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", average);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedGoldPerDay - average);
            }


        }
    }
}
