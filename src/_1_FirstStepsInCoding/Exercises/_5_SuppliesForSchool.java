package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _5_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четем от конзола
        //2. Пресмятаме цената на продуктите

        int countPenPackages = Integer.parseInt(scanner.nextLine());
        int countHighlighters = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());


        double priceForPens = countPenPackages * 5.80;
        double priceForHighlighters = countHighlighters * 7.20;
        double priceForCleaningAgent = cleaningAgent * 1.20;

        double sumWithoutDiscount = priceForPens + priceForHighlighters + priceForCleaningAgent;

        double finalSum = sumWithoutDiscount - (sumWithoutDiscount * (discount / 100.0));

        System.out.println(finalSum);

    }
}
