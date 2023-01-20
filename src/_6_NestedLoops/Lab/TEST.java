package _6_NestedLoops.Lab;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startInterval = Integer.parseInt(scan.nextLine());
        int endInterval = Integer.parseInt(scan.nextLine());
        int magicNum = Integer.parseInt(scan.nextLine());
        int sum;
        int counter = 0;

        for (int num1 = startInterval; num1 <= endInterval; num1++) {
            for (int num2 = startInterval; num2 <= endInterval; num2++) {
                sum = num1 + num2;
                counter++;
                if (sum == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, num1, num2, sum);
                    return;
                }

            }

        }
        System.out.printf("%d combinations - neither equals %d", counter, magicNum);

    }
}

