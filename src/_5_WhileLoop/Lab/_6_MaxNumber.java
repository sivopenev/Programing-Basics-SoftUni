package _5_WhileLoop.Lab;

import java.util.Scanner;

public class _6_MaxNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;
        //int minNumber = Integer.MAX_VALUE;


        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number > maxNumber) {
                maxNumber = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}
