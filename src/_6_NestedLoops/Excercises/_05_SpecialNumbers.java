package _6_NestedLoops.Excercises;

import java.util.Scanner;

public class _05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            boolean isSpecial = true;
            int current = i;
            for (int j = 1; j <= 4; j++) {
                int digit = current % 10;
                if (digit == 0 || n % digit != 0) {
                    isSpecial = false;
                    break;
                }
                current /= 10;
            }
            if (isSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}
