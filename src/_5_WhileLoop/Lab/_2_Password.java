package _5_WhileLoop.Lab;

import java.util.Scanner;

public class _2_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(password)) {
            //System.out.println("Wrong password! Try again!");
            input = scanner.nextLine();
        }

        System.out.printf("Welcome %s!", username);
    }
}
