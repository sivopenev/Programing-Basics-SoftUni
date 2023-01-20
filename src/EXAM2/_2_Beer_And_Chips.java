package EXAM2;

import java.util.Scanner;

public class _2_Beer_And_Chips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        double numb_bott_beer = Double.parseDouble(scanner.nextLine());
        double numb_packs_chips = Double.parseDouble(scanner.nextLine());


        double price_of_beer = 1.2;
        double total_price_of_beers = (numb_bott_beer * price_of_beer);
        double price_of_packg_chips = (total_price_of_beers * 0.45);
        double total_price_of_chips = Math.ceil(numb_packs_chips * price_of_packg_chips);
        double total_price = total_price_of_beers + total_price_of_chips;


        double diff = Math.abs(budget - total_price);

        if (budget >= total_price) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }
    }
}
