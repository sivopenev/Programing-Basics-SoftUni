package Online_Exam_July_2020;

import java.util.Scanner;

public class _4_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int ballsNum = Integer.parseInt(scanner.nextLine());


        int redBalls = 0;
        int orangeBalls = 0;
        int yellow_Balls = 0;
        int white_balls = 0;
        int otherColors = 0;
        int dividesFromBlackBall = 0;
        int totalPoints = 0;

        for (int i = 0; i < ballsNum; i++) {
            String color = scanner.nextLine();

            switch (color) {

                case "red": {
                    redBalls++;
                    totalPoints += 5;
                }
                break;
                case "orange": {
                    orangeBalls++;
                    totalPoints += 10;
                }
                break;
                case "yellow": {
                    yellow_Balls++;
                    totalPoints += 15;

                }
                break;
                case "white": {
                    white_balls++;
                    totalPoints += 20;
                }
                break;
                case "black": {
                    dividesFromBlackBall++;
                totalPoints = totalPoints/2;
                }
                break;
                default: {
                    otherColors++;
                }
            }


        }
        System.out.printf("Total points: %d%n", totalPoints);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellow_Balls);
        System.out.printf("White balls: %d%n", white_balls);
        System.out.printf("Other colors picked: %d%n", otherColors);
        System.out.printf("Divides from black balls: %d", dividesFromBlackBall);
    }
}