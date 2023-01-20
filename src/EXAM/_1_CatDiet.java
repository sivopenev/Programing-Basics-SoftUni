package EXAM;

import java.util.Scanner;

public class _1_CatDiet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int percentFat = Integer.parseInt(scanner.nextLine());
        int percentProteins = Integer.parseInt(scanner.nextLine());
        int percentCarbohydrates = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentWater = Integer.parseInt(scanner.nextLine());

        double allFat = ((percentFat / 100.0) * allCalories) / 9;
        double allProteins = ((percentProteins / 100.0) * allCalories) / 4;
        double allCarbohydrates = ((percentCarbohydrates / 100.0) * allCalories) / 4;

        double foodAllGrams = allFat + allProteins + allCarbohydrates;

        double caloriesPerGramFood = allCalories / foodAllGrams;

        double allPercentWater = 100 - percentWater;

        double result = (allPercentWater / 100) * caloriesPerGramFood;

        System.out.printf("%.4f", result);

    }
}
