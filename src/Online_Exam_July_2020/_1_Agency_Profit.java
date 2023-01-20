package Online_Exam_July_2020;

import java.util.Scanner;

public class _1_Agency_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String companyName = scanner.nextLine();
        int adultTicketsCount = Integer.parseInt(scanner.nextLine());
        int childTicketsCount = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceTax = Double.parseDouble(scanner.nextLine());

        double total = 0;
        double childTicketPrice = adultTicketPrice - adultTicketPrice * 0.7;
        double adultTicketWithTax = adultTicketPrice + serviceTax;
        double childTicketWithTax = childTicketPrice + serviceTax;
        total += adultTicketWithTax * adultTicketsCount + childTicketWithTax * childTicketsCount;
        total = total * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, total);

    }
}
