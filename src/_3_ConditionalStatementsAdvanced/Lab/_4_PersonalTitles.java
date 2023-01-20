package _3_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class _4_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        switch (gender) {
            case "m":
                if (age < 16) {
                    System.out.println("Master");
                } else {
                    System.out.println("Mr.");
                }
                break;
            case "f":
                if (age < 16) {
                    System.out.println("Miss");
                } else {
                    System.out.println("Mrs.");
                }
                break;
        }
    }
}