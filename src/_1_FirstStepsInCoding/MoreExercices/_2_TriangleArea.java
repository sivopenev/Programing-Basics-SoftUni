package _1_FirstStepsInCoding.MoreExercices;

import java.util.Scanner;

public class _2_TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = a * h / 2;

        System.out.printf("%.2f", area);


    }
}
