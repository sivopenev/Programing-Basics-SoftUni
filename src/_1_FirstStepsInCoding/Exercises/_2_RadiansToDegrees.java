package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());

        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
