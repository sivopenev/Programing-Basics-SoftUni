package Online_Exam_March_2019;

import java.util.Scanner;

public class _2_Football_Results2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String game1 = scanner.nextLine();
        String game2 = scanner.nextLine();
        String game3 = scanner.nextLine();

        int wins = 0;
        int draws = 0;
        int losses = 0;


        int homeGame1 = game1.charAt(0);
        int awayGame1 = game1.charAt(2);

        if (homeGame1 > awayGame1) {
            wins++;
        } else if (homeGame1 == awayGame1) {
            draws++;
        } else {
            losses++;
        }

        int homeGame2 = game2.charAt(0);
        int awayGame2 = game2.charAt(2);

        if (homeGame2 > awayGame2) {
            wins++;
        } else if (homeGame2 == awayGame2) {
            draws++;
        } else {
            losses++;
        }

        int homeGame3 = game3.charAt(0);
        int awayGame3 = game3.charAt(2);

        if (homeGame3 > awayGame3) {
            wins++;
        } else if (homeGame3 == awayGame3) {
            draws++;
        } else {
            losses++;
        }

        System.out.printf("Team won %d games.%n",wins);
        System.out.printf("Team lost %d games.%n",losses);
        System.out.printf("Drawn games: %d",draws);

    }
}
