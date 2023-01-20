package Online_Exam_July_2020;

import java.util.Scanner;

public class _3_AluminiumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countAluJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();
        double totalSum = 0;

        switch (typeJoinery) {

            case "90X130": {

                totalSum += countAluJoinery * 110;
                if (countAluJoinery > 30 && countAluJoinery <= 60) {
                    totalSum -= totalSum * 0.05;
                } else if (countAluJoinery > 60) {
                    totalSum -= totalSum * 0.08;
                }
            }
            break;

            case "100X150": {
                totalSum += countAluJoinery * 140;
                if (countAluJoinery > 40 && countAluJoinery <= 80) {
                    totalSum -= totalSum * 0.06;
                } else if (countAluJoinery > 80) {
                    totalSum -= totalSum * 0.10;
                }
            }
            break;

            case "130X180": {
                totalSum += countAluJoinery * 190;
                if (countAluJoinery > 20 && countAluJoinery <= 50) {
                    totalSum -= totalSum * 0.07;
                } else if (countAluJoinery > 50) {
                    totalSum -= totalSum * 0.12;
                }
            }
            break;
            case "200X300": {
                totalSum += countAluJoinery * 250;

                if (countAluJoinery > 25 && countAluJoinery <= 50) {
                    totalSum -= totalSum * 0.09;
                } else if (countAluJoinery > 50) {
                    totalSum -= totalSum * 0.14;
                }
            }
            break;
        }

        if (delivery.equals("With delivery")) {
            totalSum += 60;
        }

        if (countAluJoinery > 99) {
            totalSum -= totalSum * 0.04;
            System.out.printf("%.2f BGN", totalSum);

        } else if (countAluJoinery < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalSum);
        }
    }
}
