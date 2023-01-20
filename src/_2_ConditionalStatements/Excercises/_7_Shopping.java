package _2_ConditionalStatements.Excercises;

import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double graphicCards = Double.parseDouble(scanner.nextLine());
        double processors = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());

        double graphicCardPrice = graphicCards * 250;
        double processorPrice = processors * (graphicCardPrice * 0.35);
        double ramPrice = ram * (graphicCardPrice * 0.1);

        double total = graphicCardPrice + processorPrice + ramPrice;

        double discount = 0;
        double totalAfterDiscount = total - discount;


        if (graphicCards > processors) {
            discount = total * 0.15;
            totalAfterDiscount = total - discount;

        }

        if (budget >= totalAfterDiscount) {

            System.out.printf("You have %.2f leva left!", budget - totalAfterDiscount);

        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", (Math.abs(budget - totalAfterDiscount)));
        }


    }
}