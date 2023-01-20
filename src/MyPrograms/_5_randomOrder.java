package MyPrograms;

import java.util.Random;
import java.util.Scanner;

public class _5_randomOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] players = {"Sivo", "Reni", "Alex", "Gabi", "Diana"};
        String randomPick = players[new Random().nextInt(players.length)];

        int sivo = 0, reni = 0, alex = 0, gabi = 0, diana = 0;

        for (int i = 0; true; i++) {

            switch (randomPick) {
                case "Sivo":
                    sivo++;
                    if (sivo == 1) {
                        System.out.println("Sivo");
                    }
                    break;
                case "Reni":
                    reni++;
                    if (reni == 1) {
                        System.out.println("Reni");
                    }
                    break;
                case "Alex":
                    alex++;
                    if (alex == 1) {
                        System.out.println("Alex");
                    }
                    break;
                case "Gabi":
                    gabi++;
                    if (gabi == 1) {
                        System.out.println("Gabi");
                    }
                    break;
                case "Diana":
                    diana++;
                    if (diana == 1) {
                        System.out.println("Diana");
                    }
                    break;
            }
            randomPick = players[new Random().nextInt(players.length)];

            if (sivo == 1 && reni == 1 && alex == 1 && gabi == 1 && diana == 1) {
                break;
            }

        }

    }
}
