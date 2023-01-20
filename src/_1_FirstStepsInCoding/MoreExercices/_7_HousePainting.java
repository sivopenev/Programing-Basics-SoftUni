package _1_FirstStepsInCoding.MoreExercices;

import java.util.Scanner;

public class _7_HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //Steni
        double sidewall = x * y;
        double window = 2.25;
        double bothSides = sidewall * 2 - (2 * window);
        double backWall = x * x;
        double door = 2.4;
        double frontAndBackWall = backWall * 2 - door;
        double totalWallArea = bothSides + frontAndBackWall;
        double greenPaint = totalWallArea / 3.4;

        //pokriv
        double roofSquareSides = 2 * (x * y);
        double roodTriangleSides = 2 * (x * h / 2);
        double totalRoofArea = roofSquareSides + roodTriangleSides;
        double redPaint = totalRoofArea / 4.3;

        System.out.printf("%.2f %n%.2f", greenPaint, redPaint);


    }
}
