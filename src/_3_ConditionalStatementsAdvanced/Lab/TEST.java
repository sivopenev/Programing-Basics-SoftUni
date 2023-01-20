package _3_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TEST {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

      /*  boolean isOpen = (day.equals("Monday")|| day.equals("Tuesday") || day.equals("Wednesday")||
                day.equals("Thursday") || day.equals("Friday") || day.equals("Saturday") );
        if (number>=10 && number <=18){
            System.out.println("Open");
        }else {
            System.out.println("Closed");
        }
        if (day.equals("Sunday")){
            System.out.println("Closed");
        }*/

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18) {
                    System.out.println("Open");
                } else {
                    System.out.println("Closed");
                }
                break;
            case "Sunday":
                System.out.println("Closed");
                break;
        }

    }
}