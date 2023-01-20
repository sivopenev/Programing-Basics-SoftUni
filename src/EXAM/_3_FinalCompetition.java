package EXAM;

import java.util.Scanner;

public class _3_FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancerCount = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = scanner.nextLine();

        double charityMoney;
        double payPerPerson;

        double sum = dancerCount * points;

        if (location.equals("Bulgaria")) {
            if (season.equals("summer")) {
                sum = sum - (sum * 0.05);
            } else if (season.equals("winter")) {
                sum = sum - (sum * 0.08);
            }
        }

        if (location.equals("Abroad")) {
            sum *= 1.50;

            if (season.equals("summer")) {
                sum = sum - (sum * 0.10);
            } else if (season.equals("winter")) {
                sum = sum - (sum * 0.15);
            }
        }


        charityMoney = sum * 0.75;
        payPerPerson = (sum - charityMoney) / dancerCount;

        System.out.printf("Charity - %.2f\n", charityMoney);
        System.out.printf("Money per dancer - %.2f", payPerPerson);

    }
}
