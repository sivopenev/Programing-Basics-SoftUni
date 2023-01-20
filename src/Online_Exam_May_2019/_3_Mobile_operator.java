package Online_Exam_May_2019;

import java.util.Scanner;

public class _3_Mobile_operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String contractPeriod = scanner.nextLine();
        String contractType = scanner.nextLine();
        String internet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0;
        switch (contractPeriod) {
            case "one": {
                if (contractType.equals("Small")) { // такса  9.98 лв.
                    if (internet.equals("yes")) { // при такса по-малка или равна на 10.00 лв.  5.50 лв.
                        totalPrice += 9.98 + 5.50;
                    } else {
                        totalPrice += 9.98;
                    }
                } else if (contractType.equals("Middle")) { // такса 18.99 лв.
                    if (internet.equals("yes")) {
                        totalPrice += 18.99 + 4.35; // при такса по-малка или равна на 30.00 лв.  4.35 лв.
                    } else {
                        totalPrice += 18.99;
                    }
                } else if (contractType.equals("Large")) { // такса 25.98 лв.
                    if (internet.equals("yes")) {
                        totalPrice += 25.98 + 4.35; // при такса по-малка или равна на 30.00 лв.  4.35 лв.
                    } else {
                        totalPrice += 25.98;
                    }
                } else if (contractType.equals("ExtraLarge")) { // такса 35.99 лв.
                    if (internet.equals("yes")) {
                        totalPrice += 35.99 + 3.85; // при такса по-голяма от 30.00 лв.  3.85 лв.
                    } else {
                        totalPrice += 35.99;
                    }
                }
            }
            break;

            case "two": {
                if (contractType.equals("Small")) { // такса  8.58 лв.
                    if (internet.equals("yes")) { // при такса по-малка или равна на 10.00 лв.  5.50 лв.
                        totalPrice += 8.58 + 5.50;
                    } else {
                        totalPrice += 8.58;
                    }
                } else if (contractType.equals("Middle")) { // такса 18.99 лв.
                    if (internet.equals("yes")) {
                        totalPrice += 17.09 + 4.35; // при такса по-малка или равна на 30.00 лв.  4.35 лв.
                    } else {
                        totalPrice += 17.09;
                    }
                } else if (contractType.equals("Large")) { // такса 25.98 лв.
                    if (internet.equals("yes")) {
                        totalPrice += 23.59 + 4.35; // при такса по-малка или равна на 30.00 лв.  4.35 лв.
                    } else {
                        totalPrice += 23.59;
                    }
                } else if (contractType.equals("ExtraLarge")) { // такса 35.99 лв.
                    if (internet.equals("yes")) {
                        totalPrice += 31.79 + 3.85; // при такса по-голяма от 30.00 лв.  3.85 лв.
                    } else {
                        totalPrice += 31.79;
                    }
                }
            }
            break;
        }
        if (contractPeriod.equals("two")) {
            totalPrice -= totalPrice * 0.0375;

            System.out.printf("%.2f lv.", totalPrice * months);
        } else {
            System.out.printf("%.2f lv.", totalPrice * months);
        }
    }
}

