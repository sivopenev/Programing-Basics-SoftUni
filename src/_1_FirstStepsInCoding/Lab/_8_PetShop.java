package _1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDogFood = Integer.parseInt(scanner.nextLine());
        int numCatFood = Integer.parseInt(scanner.nextLine());

        double packetDogFood = numDogFood * 2.50;
        int packetCatFood = numCatFood * 4;

        double finalSum = packetDogFood + packetCatFood;

        System.out.println(finalSum + " lv.");

    }
}
