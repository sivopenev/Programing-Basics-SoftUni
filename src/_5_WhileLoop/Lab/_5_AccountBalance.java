package _5_WhileLoop.Lab;

import java.util.Scanner;

public class _5_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sum = 0;

        while (!input.equals("NoMoreMoney")) {
            double saldo = Double.parseDouble(input);
            if (saldo < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", saldo);
            sum += saldo;

            input = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", sum);
    }
}
