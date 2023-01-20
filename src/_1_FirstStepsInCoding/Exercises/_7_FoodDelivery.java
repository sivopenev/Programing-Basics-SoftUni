package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _7_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numChickenMenus = Integer.parseInt(scanner.nextLine());
        int numFishMenus = Integer.parseInt(scanner.nextLine());
        int numVegetarianMenus = Integer.parseInt(scanner.nextLine());

        double priceChickenMenu = numChickenMenus * 10.35;
        double priceFishMenus = numFishMenus * 12.40;
        double priceVegetarianMenus = numVegetarianMenus * 8.15;
        double delivery = 2.50;

        double totalSumMenus = priceChickenMenu + priceFishMenus + priceVegetarianMenus;
        double desert = totalSumMenus * 0.2;

        double totalPrice = totalSumMenus + desert + delivery;

        System.out.println(totalPrice);
    }
}
