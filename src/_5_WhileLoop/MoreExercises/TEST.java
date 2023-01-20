package _5_WhileLoop.MoreExercises;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergent = Integer.parseInt(scanner.nextLine());
        detergent = detergent * 750;

        int washedPlates = 0;
        int washedPots = 0;
        int usedAmountDetergent = 0;

        int counter = 0;

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            counter++;

            if (counter % 3 == 0) {
                washedPots += dishes;
                usedAmountDetergent += dishes * 15;
            } else {
                washedPlates += dishes;
                usedAmountDetergent += dishes * 5;
            }

            if (detergent < usedAmountDetergent) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("End") && detergent >= usedAmountDetergent) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", washedPlates, washedPots);
            System.out.printf("Leftover detergent %d ml.", detergent - usedAmountDetergent);

        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent - usedAmountDetergent));
        }
    }
}
