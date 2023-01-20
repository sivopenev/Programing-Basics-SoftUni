package Online_Exam_March_2019;

import java.util.Scanner;

public class _2_Football_Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int homeWins = 0;
        int awayWins = 0;
        int drawGames = 0;

        for (int i = 0; i < 3; i++) {
            String game = scanner.nextLine();

            String[] arrOfStr = game.split(":");
            for (int j = 0; j < 1; j++) {
                String a = arrOfStr[0];
                int homeScore = Integer.parseInt(a);
                String b = arrOfStr[1];
                int awayScore = Integer.parseInt(b);


                if (homeScore > awayScore) {
                    homeWins++;
                } else if (homeScore == awayScore) {
                    drawGames++;
                } else {
                    awayWins++;
                }
            }
        }
        System.out.printf("Team won %d games.%n",homeWins);
        System.out.printf("Team lost %d games.%n",awayWins);
        System.out.printf("Drawn games: %d",drawGames);

    }
}
