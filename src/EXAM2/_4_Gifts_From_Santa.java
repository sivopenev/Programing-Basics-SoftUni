package EXAM2;

import java.util.Scanner;

public class _4_Gifts_From_Santa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int address = m; address >= n; address--) {
            if (address % 2 == 0 && address % 3 == 0) {
                if (address == s) {
                    break;
                }
                System.out.printf("%d ", address);
            }
        }
    }
}
