package _5_WhileLoop.Excercises;

import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        String input = scanner.nextLine();
        int bookCounter = 0;

        while (!input.equals(book)){

            if(input.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books.",bookCounter);
                break;
            }

            bookCounter++;
            input = scanner.nextLine();
        }
        if(book.equals(input)){
            System.out.printf("You checked %d books and found it.",bookCounter);
        }

    }
}
