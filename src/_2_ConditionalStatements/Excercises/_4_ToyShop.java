package _2_ConditionalStatements.Excercises;

import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int talkingDollsNum = Integer.parseInt(scanner.nextLine());
        int teddyBearsNum = Integer.parseInt(scanner.nextLine());
        int minionsNum = Integer.parseInt(scanner.nextLine());
        int trucksNum = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        int talkingDollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        int truckPrice = 2;

        double totalPrice = (puzzleNum * puzzlePrice + talkingDollsNum * talkingDollPrice + teddyBearsNum * teddyBearPrice
                + minionsNum * minionPrice + trucksNum * truckPrice);

        int totalToysOrdered = (puzzleNum + talkingDollsNum + teddyBearsNum + minionsNum + trucksNum);


        if (totalToysOrdered >= 50) {
            totalPrice -= totalPrice * 0.25;
        }

        double rent = totalPrice * 0.1;
        totalPrice -= rent;
        double totalProfit = totalPrice - tripPrice;


        if (totalPrice >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalProfit);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalProfit));
        }
    }
}