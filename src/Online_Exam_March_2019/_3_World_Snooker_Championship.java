package Online_Exam_March_2019;

import java.util.Scanner;

public class _3_World_Snooker_Championship {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String competitionLevel = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int ticketsNumber = Integer.parseInt(scanner.nextLine());
        String trophyPicture = scanner.nextLine();


        double totalPrice = 0;


        switch (competitionLevel) {
            case "Quarter final":

                switch (ticketType) {
                    case "Standard":
                        totalPrice += ticketsNumber * 55.50;
                        break;
                    case "Premium":
                        totalPrice += ticketsNumber * 105.20;
                        break;
                    case "VIP":
                        totalPrice += ticketsNumber * 118.90;
                        break;
                }
                break;

            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        totalPrice += ticketsNumber * 75.88;
                        break;
                    case "Premium":
                        totalPrice += ticketsNumber * 125.22;
                        break;
                    case "VIP":
                        totalPrice += ticketsNumber * 300.40;
                        break;
                }
                break;

            case "Final":
                switch (ticketType) {
                    case "Standard":
                        totalPrice += ticketsNumber * 110.10;
                        break;
                    case "Premium":
                        totalPrice += ticketsNumber * 160.66;
                        break;
                    case "VIP":
                        totalPrice += ticketsNumber * 400;
                        break;
                }
                break;
        }

        if (totalPrice > 4000) {
            totalPrice -= totalPrice * 0.25;
        } else if (totalPrice > 2500) {
            totalPrice -= totalPrice * 0.10;
            if (trophyPicture.equals("Y")) {
                totalPrice += ticketsNumber * 40;
            }
        } else {
            if (trophyPicture.equals("Y")) {
                totalPrice += ticketsNumber * 40;
            }
        }

        System.out.printf("%.2f", totalPrice);
    }
}
