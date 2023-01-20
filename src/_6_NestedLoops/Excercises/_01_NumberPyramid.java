package _6_NestedLoops.Excercises;

import java.util.Scanner;

public class _01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        boolean pyramidDone = false;
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 1; cols <= rows; cols++) {
                if (number > n) {
                    pyramidDone = true;
                    break;
                }
                System.out.print(number + " ");
                number++;
            }
            if (pyramidDone) {
                break;
            } else {
                System.out.println();
            }
        }
    }
}
