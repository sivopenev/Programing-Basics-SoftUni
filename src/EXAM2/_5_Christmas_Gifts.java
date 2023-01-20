package EXAM2;

import java.util.Scanner;

public class _5_Christmas_Gifts {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int adults = 0;
        int kids = 0;

        while (!input.equals("Christmas")) {
            int years = Integer.parseInt(input);
            if (years > 16) {
                adults++;
            } else {
                kids++;
            }
            input = scanner.nextLine();
        }

        int moneyToys = kids * 5;
        int moneySweaters = adults * 15;

        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n", kids);
        System.out.printf("Money for toys: %d%n", moneyToys);
        System.out.printf("Money for sweaters: %d", moneySweaters);
    }
}