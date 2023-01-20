package _2_ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class _7_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLiters = Double.parseDouble(scanner.nextLine());

        if(fuelLiters < 25) {
            switch (fuelType) {
                case "Diesel":
                    System.out.println("Fill your tank with diesel!");
                    break;
                case "Gasoline":
                    System.out.println("Fill your tank with gasoline!");
                    break;
                case "Gas":
                    System.out.println("Fill your tank with gas!");
                    break;
                default:
                    System.out.println("Invalid fuel!");
                    break;
            }
        } else {
            switch (fuelType) {
                case "Diesel":
                    System.out.println("You have enough diesel.");
                    break;
                case "Gasoline":
                    System.out.println("You have enough gasoline.");
                    break;
                case "Gas":
                    System.out.println("You have enough gas.");
                    break;
                default:
                    System.out.println("Invalid fuel!");
                    break;
            }
        }
    }
}
