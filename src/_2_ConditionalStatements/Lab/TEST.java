package _2_ConditionalStatements.Lab;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double area = 0;

        switch (figure) {
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                break;
            case "rectangle":
                double side1 = Double.parseDouble(scanner.nextLine());
                double side2 = Double.parseDouble(scanner.nextLine());
                area = side1 * side2;
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                area = Math.PI * (radius * radius);
                break;
            case "triangle":
                double side = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                area = side * height / 2;
                break;
        }
        System.out.printf("%.3f", area);
    }
}
