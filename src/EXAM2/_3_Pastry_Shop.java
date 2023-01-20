package EXAM2;

import java.util.Scanner;

public class _3_Pastry_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int countCakes = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        double price = 0;


        switch (text) {
            case "Cake":
                if (day <= 15) {
                    price = countCakes * 24;
                    price *= 0.90;
                } else {
                    price = countCakes * 28.70;
                }
                break;

            case "Souffle":
                if (day <= 15) {
                    price = countCakes * 6.66;
                    price *= 0.90;
                } else {
                    price = countCakes * 9.80;
                }
                break;

            case "Baklava":
                if (day <= 15) {
                    price = countCakes * 12.60;
                    price *= 0.90;
                } else {
                    price = countCakes * 16.98;
                }
                break;
        }

        if (day <= 22) {
            if (price >= 100 && price <= 200) {
                price *= 0.85;
            } else if (price > 200) {
                price *= 0.75;
            }
        }
        System.out.printf("%.2f", price);
    }
}
