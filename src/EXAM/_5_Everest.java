package EXAM;

import java.util.Scanner;

public class _5_Everest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 5364;
        int end = 8848;
        int daysCounter = 1;
        String input = scan.nextLine();
        while (!input.equals("END")) {
            int climbed = Integer.parseInt(scan.nextLine());
            if (input.equals("Yes")) {
                daysCounter++;
                if (daysCounter > 5) {
                    System.out.println("Failed!");
                    System.out.printf("%d", start);
                    return;
                }
                start += climbed;
            } else {
                start += climbed;
            }
            if (start >= end) {
                System.out.printf("Goal reached for %d days!", daysCounter);
                return;
            }
            input = scan.nextLine();
        }
        System.out.println("Failed!");
        System.out.printf("%d", start);
    }
}

