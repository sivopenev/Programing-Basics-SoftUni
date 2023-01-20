package _2_ConditionalStatements.Lab;


import java.util.Scanner;

public class _7_AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        switch (figure) {
            case "square":
                double square = Double.parseDouble(scanner.nextLine());
                double squareArea = square * square;
                System.out.printf("%.3f", squareArea);
                break;
            case "rectangle":
                double length = Double.parseDouble(scanner.nextLine());
                double width = Double.parseDouble(scanner.nextLine());
                double rectangleArea = length * width;
                System.out.printf("%.3f", rectangleArea);
                break;
            case "circle":
                double radius = Double.parseDouble(scanner.nextLine());
                double circleArea = Math.PI * (radius * radius);
                System.out.printf("%.3f", circleArea);
                break;
            case "triangle":
                double side = Double.parseDouble(scanner.nextLine());
                double height = Double.parseDouble(scanner.nextLine());
                double triangleArea = side * height / 2;
                System.out.printf("%.3f", triangleArea);
                break;
        }

    }
}
