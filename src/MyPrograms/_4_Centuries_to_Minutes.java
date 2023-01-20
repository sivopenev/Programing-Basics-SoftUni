package MyPrograms;

import java.util.Scanner;

public class _4_Centuries_to_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centuries = Integer.parseInt(scanner.nextLine());

        double minutes = (centuries * 100 * 365.2425 * 24 * 60);
        double minutes2 = centuries * 52594920;
        System.out.printf("%.0f centuries = %.0f minutes%n", centuries, minutes);
        System.out.printf("%.0f centuries = %.0f minutes%n", centuries, minutes2);

    }
}