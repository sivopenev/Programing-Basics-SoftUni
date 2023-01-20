package Online_Exam_March_2019;

import java.util.Scanner;

public class _1_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //такса за тренировка за 1 година
        int earlyTax = Integer.parseInt(scanner.nextLine());
        //кецове
        double sneakers = earlyTax - 0.40 * earlyTax;
        //екип
        double equipment = sneakers - 0.2 * sneakers;
        //топка
        double ball = 1.0 / 4 * equipment;
        //аксесоари
        double accessories = 1.0 / 5 * ball;

        double totalSum = earlyTax + sneakers + equipment + ball + accessories;

        System.out.printf("%.2f", totalSum);


    }
}

