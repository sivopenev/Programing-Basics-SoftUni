package _4_ForLoop.Lab;

import java.util.Scanner;

public class _6_VowelsSum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);


            switch (text.charAt(i)) {
                case 'a' -> sum += 1;
                case 'e' -> sum += 2;
                case 'i' -> sum += 3;
                case 'o' -> sum += 4;
                case 'u' -> sum += 5;
            }
        }
        System.out.println(sum);
    }

}