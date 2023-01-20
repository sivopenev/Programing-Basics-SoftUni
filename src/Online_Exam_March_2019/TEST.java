package Online_Exam_March_2019;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double centuries = Integer.parseInt(scanner.nextLine());
        double centuries2 = Integer.parseInt(scanner.nextLine());

        double minutes =  (centuries * 100 * 365.2425 * 24 * 60);
        double minutes2 = centuries * 52594920;
        System.out.printf("%.0f centuries = %.0f minutes%n", centuries,minutes);
        System.out.printf("%.0f centuries = %.0f minutes%n", centuries2,minutes2);
    }
}
