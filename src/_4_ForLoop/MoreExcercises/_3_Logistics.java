package _4_ForLoop.MoreExcercises;

import java.util.Scanner;

public class _3_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLoads = Integer.parseInt(scanner.nextLine());
        int totalCost = 0;
        int minibusTons = 0;
        int truckTons = 0;
        int trainTons = 0;

        double totalTons = 0;

        for (int i = 1; i <= totalLoads; i++) {
            int weightTons = Integer.parseInt(scanner.nextLine());
            int loadCost;

            if (weightTons <= 3) {
                loadCost = weightTons * 200;
                minibusTons += weightTons;
            } else if (weightTons <= 11) {
                loadCost = weightTons * 175;
                truckTons += weightTons;
            } else {
                loadCost = weightTons * 120;
                trainTons += weightTons;
            }
            totalTons += weightTons;
            totalCost += loadCost;
        }
        double averageCost = totalCost / totalTons;
        double percentageMinibusTons = minibusTons / totalTons * 100;
        double percentageTruckTons = truckTons / totalTons * 100;
        double percentageTrainTons = trainTons / totalTons * 100;

        System.out.printf("%.2f%n", averageCost);
        System.out.printf("%.2f%%%n", percentageMinibusTons);
        System.out.printf("%.2f%%%n", percentageTruckTons);
        System.out.printf("%.2f%%", percentageTrainTons);
    }
}
