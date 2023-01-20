package _2_ConditionalStatements.Excercises;

import java.util.Scanner;

public class _5_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPricePerStatist = Double.parseDouble(scanner.nextLine());


        double decoration = budget * 0.1;
        double clothesPrice = statists * clothesPricePerStatist;

        double total;
        if (statists > 150) {
            total = decoration + clothesPrice - (clothesPrice * 0.1);

        } else {
            total = decoration + clothesPrice;
        }
        double difference = Math.abs(budget - total);

        if (budget >= total) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", difference);
        }

    }
}
