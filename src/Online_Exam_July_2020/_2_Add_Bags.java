package Online_Exam_July_2020;

import java.util.Scanner;

public class _2_Add_Bags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baggagePrice = Double.parseDouble(scanner.nextLine());
        double baggageKilos = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int baggageCount = Integer.parseInt(scanner.nextLine());


        double total = 0;

        if (baggageKilos < 10) {
            total += baggagePrice * 0.2;
        } else if (baggageKilos >= 10 && baggageKilos <=20) {
            total += baggagePrice / 2;

        } else if (baggageKilos > 20) {
            total += baggagePrice;
        }

        if (daysToTrip < 7) {
            total += total * 0.4;
        } else if (daysToTrip <= 30) {
            total += total * 0.15;
        } else {
            total += total * 0.1;
        }
        System.out.printf("The total price of bags is: %.2f lv. ",total * baggageCount);
    }
}
