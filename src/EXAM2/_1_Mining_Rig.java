package EXAM2;

import java.util.Scanner;

public class _1_Mining_Rig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceVideoCard = Integer.parseInt(scanner.nextLine());
        int priceAdapter = Integer.parseInt(scanner.nextLine());
        double priceElConsumption = Double.parseDouble(scanner.nextLine());
        double profitOneDayCard = Double.parseDouble(scanner.nextLine());

        int totalPriceVideoCard = priceVideoCard * 13;
        int totalPriceAdapter = priceAdapter * 13;
        int totalPrice = totalPriceVideoCard + totalPriceAdapter + 1000;

        System.out.println(totalPrice);

        double totalProfitOneDayCard = profitOneDayCard - priceElConsumption;
        double totalProfitOneDayAllCards = 13 * totalProfitOneDayCard;
        int days = (int) Math.ceil(totalPrice / totalProfitOneDayAllCards);

        System.out.println(days);
    }
}

