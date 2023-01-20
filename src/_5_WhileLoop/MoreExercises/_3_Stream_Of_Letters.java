package _5_WhileLoop.MoreExercises;

import java.util.Scanner;

public class _3_Stream_Of_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countC = 0;
        int countO = 0;
        int countN = 0;
        int countOut = 0;
        String output = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            } else if (input.charAt(0) > 64 && input.charAt(0) < 91 || input.charAt(0) > 96 && input.charAt(0) < 123) {
                switch (input) {
                    case "c":
                        countC++;
                        if (countC > 1) {
                            output = output + input;
                        } else {
                            countOut++;
                        }
                        break;
                    case "o":
                        countO++;
                        if (countO > 1) {
                            output = output + input;
                        } else {
                            countOut++;
                        }
                        break;
                    case "n":
                        countN++;
                        if (countN > 1) {
                            output = output + input;
                        } else {
                            countOut++;
                        }
                        break;
                    default:
                        output = output + input;
                        break;
                }
                if (countOut > 2) {
                    countOut = 0;
                    countC = 0;
                    countN = 0;
                    countO = 0;
                    System.out.print(output + " ");
                    output = "";
                }
            }
        }
    }
}
