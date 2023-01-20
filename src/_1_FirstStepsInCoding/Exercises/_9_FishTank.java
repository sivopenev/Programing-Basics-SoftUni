package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* 1. Четем от конзолата
           1.1 Дължината, височината, широчина, процент
           2. Пресмятаме обема на аквариума
           3. Пресмятаме бема в литри
         */

        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volume = length * wight * height;
        double fullTankLitres = volume * 0.001;

        double neededLitres = fullTankLitres * (1 - percent / 100);
        System.out.println(neededLitres);
    }
}
