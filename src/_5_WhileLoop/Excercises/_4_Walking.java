package _5_WhileLoop.Excercises;

import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalSteps = 0;

        while (!command.equals("Going home")) {
            double steps = Double.parseDouble(command);
            totalSteps += steps;

            if (totalSteps >= 10000) {
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Going home")) {
            int stepsToHome = Integer.parseInt(scanner.nextLine());
            totalSteps += stepsToHome;
        }

        if (totalSteps >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", totalSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", totalSteps - 10000);
        }

    }
}
