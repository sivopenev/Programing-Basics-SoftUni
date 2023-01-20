package _5_WhileLoop.Excercises;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int totalDays = 0;
        int consecutiveDaysSpending = 0;
        double currentMoney = ownedMoney;


        String input = scanner.nextLine();

        while (currentMoney < neededMoney) {


            switch (input) {
                case "spend":
                    double spendMoney = Double.parseDouble(scanner.nextLine());
                    currentMoney -= spendMoney;
                    if (currentMoney < spendMoney) {
                        currentMoney = 0;
                    }
                    totalDays++;
                    consecutiveDaysSpending++;
                    break;
                case "save":
                    double saveMoney = Double.parseDouble(scanner.nextLine());
                    currentMoney += saveMoney;
                    totalDays++;
                    consecutiveDaysSpending = 0;
                    break;
            }

            if (currentMoney >= neededMoney) {
                System.out.printf("You saved the money for %d days.", totalDays);
                break;
            }

            if (consecutiveDaysSpending == 5) {
                System.out.printf("You can't save the money.%n%d", totalDays);
                break;
            }
            input = scanner.nextLine();
        }

    }

}
