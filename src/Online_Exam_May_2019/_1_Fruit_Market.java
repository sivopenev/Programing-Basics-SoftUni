package Online_Exam_May_2019;

import java.util.Scanner;

public class _1_Fruit_Market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double berries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double berriesPrice = (strawberriesPrice / 2);
        double orangesPrice = (berriesPrice - (berriesPrice * 0.40));
        double bananasPrice = (berriesPrice - (berriesPrice * 0.80));

        double total = (bananasPrice * bananas) + (orangesPrice * oranges) +
                (berriesPrice * berries) + (strawberriesPrice * strawberries);

        System.out.printf("%.2f",total);
    }
}
