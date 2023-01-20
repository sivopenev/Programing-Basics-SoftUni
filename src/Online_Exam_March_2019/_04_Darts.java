package Online_Exam_March_2019;

import java.util.Scanner;

public class _04_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playersName = scanner.nextLine();


        int shots = 0;
        int points = 301;
        int unsuccessfulShots = 0;
        boolean hasWon = false;

        String shotType = scanner.nextLine();

        while (!shotType.equals("Retire")) {

            int hitPoints = Integer.parseInt(scanner.nextLine());

            switch (shotType) {
                case "Single": {
                    points -= hitPoints;
                    if (points < 0) {
                        points += hitPoints;
                        unsuccessfulShots++;

                    } else if (points == 0) {
                        shots++;
                        hasWon = true;
                    } else {
                        shots++;
                    }
                }
                break;
                case "Double": {
                    points -= hitPoints * 2;
                    if (points < 0) {
                        points += hitPoints * 2;
                        unsuccessfulShots++;

                    } else if (points == 0) {
                        shots++;
                        hasWon = true;
                    } else {
                        shots++;
                    }
                }
                break;

                case "Triple": {
                    points -= hitPoints * 3;
                    if (points < 0) {
                        points += hitPoints * 3;
                        unsuccessfulShots++;

                    } else if (points == 0) {
                        shots++;
                        hasWon = true;
                    } else {
                        shots++;
                    }
                }
                break;
            }
            if (hasWon){
                break;
            }
            shotType = scanner.nextLine();
        }


        if (hasWon) {
            System.out.println(playersName + " won the leg with " + shots + " shots.");
        }else {

            System.out.printf("%s retired after %d unsuccessful shots.", playersName, unsuccessfulShots);
        }
    }

}
