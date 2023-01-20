package _6_NestedLoops.Lab;

import java.util.Scanner;

public class _3_Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int combinations = 0;

        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                for (int c = 0; c <= n; c++) {
                    int result = a + b + c;
                    if (result == n)
                        combinations++;
                }
            }
        }
        System.out.println(combinations);
    }
}
