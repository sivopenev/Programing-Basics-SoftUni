package Online_Exam_May_2019;

import java.util.Scanner;

public class _4_Tourist_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());

        int productsCount = 0;
        double moneyLeft = budget;
        boolean noMoney = false;

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String product = input;
            double price = Double.parseDouble(scanner.nextLine());
            productsCount++;

            if (productsCount % 3 == 0) {
                price *= 0.50;
            }
            moneyLeft -= price;

            if (moneyLeft < 0) {
                noMoney = true;
                break;
            }
            input = scanner.nextLine();

        }
        if (noMoney) {
            System.out.printf("You don't have enough money!%nYou need %.2f leva!", Math.abs(moneyLeft));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", productsCount, budget - moneyLeft);
        }
    }
}
