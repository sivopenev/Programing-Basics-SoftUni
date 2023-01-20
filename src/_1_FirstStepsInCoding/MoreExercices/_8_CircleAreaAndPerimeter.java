package _1_FirstStepsInCoding.MoreExercices;

import java.util.Scanner;

public class _8_CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double circleArea = Math.PI * (r * r);
        double parameter = 2 * Math.PI * r;
        System.out.printf("%.2f %n%.2f ", circleArea, parameter);

    }
}
