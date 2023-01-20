package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfPages = Integer.parseInt(scanner.nextLine());
        int pagesAnHour = Integer.parseInt(scanner.nextLine());
        int numOfDays = Integer.parseInt(scanner.nextLine());

        int totalTimeReading = numOfPages / pagesAnHour;
        int dailyHoursNeeded = totalTimeReading / numOfDays;


        System.out.println(dailyHoursNeeded);


    }
}
