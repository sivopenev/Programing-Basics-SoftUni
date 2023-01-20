package EXAM;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String tournamentName = scanner.nextLine();

        int gameNumber = 0;
        int wonGames = 0;
        int lostGames = 0;
        int totalGames = 0;

        while (!tournamentName.equals("End of tournaments")) {

            int numGames = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numGames; i++) {

                int pointsDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointsRivals = Integer.parseInt(scanner.nextLine());

                gameNumber++;
                totalGames++;

                if (pointsDesiTeam > pointsRivals) {
                    wonGames++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", gameNumber, tournamentName, pointsDesiTeam - pointsRivals);
                } else {
                    lostGames++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", gameNumber, tournamentName, Math.abs(pointsDesiTeam - pointsRivals));
                }

            }
            gameNumber = 0;
            tournamentName = scanner.nextLine();
        }
        double percentWin = (1.0 * wonGames/totalGames) * 100;
        double percentLoses = (1.0 * lostGames/totalGames) * 100;

        System.out.printf("%.2f%% matches win%n", percentWin);
        System.out.printf("%.2f%% matches lost", percentLoses);

    }
}

