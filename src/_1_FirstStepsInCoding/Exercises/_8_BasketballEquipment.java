package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyPrice = Integer.parseInt(scanner.nextLine());
        double basketballSnickers = yearlyPrice - (yearlyPrice * 0.4);
        double basketballEquip = basketballSnickers - (basketballSnickers * 0.2);
        double ball = basketballEquip / 4;
        double basketballAccessories = ball / 5;

        double totalPrice = yearlyPrice + basketballSnickers + basketballEquip + ball + basketballAccessories;

        System.out.println(totalPrice);

    }
}
