package _4_ForLoop.Exercises;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int trekkersMusala = 0;
        int trekkersMontBlanc = 0;
        int trekkersKilimanjaro = 0;
        int trekkersK2 = 0;
        int trekkersEverest = 0;
        double totalTrekkers = 0;

        for (int i = 1; i <= groups; i++) {
            int groupMembers = Integer.parseInt(scanner.nextLine());
            totalTrekkers += groupMembers;
            if (groupMembers <= 5) {
                trekkersMusala += groupMembers;
            } else if (groupMembers <= 12) {
                trekkersMontBlanc += groupMembers;
            } else if (groupMembers <= 25) {
                trekkersKilimanjaro += groupMembers;
            } else if (groupMembers <= 40) {
                trekkersK2 += groupMembers;
            } else {
                trekkersEverest += groupMembers;
            }
        }

        System.out.printf("%.2f%%%n", trekkersMusala / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersMontBlanc / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersKilimanjaro / totalTrekkers * 100);
        System.out.printf("%.2f%%%n", trekkersK2 / totalTrekkers * 100);
        System.out.printf("%.2f%%", trekkersEverest / totalTrekkers * 100);
    }


}
