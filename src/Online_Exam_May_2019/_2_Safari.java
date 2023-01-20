package Online_Exam_May_2019;

import java.util.Scanner;

public class _2_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();


        double fuelPrice = fuelLitres * 2.10;
        double total = fuelPrice + 100;

        if (day.equals("Saturday")) {
            total -= total * 0.10;
        } else if (day.equals("Sunday")) {
            total -= total * 0.20;
        }


        if (budget >= total) {
            System.out.printf("Safari time! Money left: %.2f lv. ", budget - total);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget - total));
        }
    }
}
