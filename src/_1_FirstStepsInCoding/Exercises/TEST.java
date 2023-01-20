package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int wight = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int poolSize = length * wight * hight;
        double sizeInLitres = poolSize * 0.001;

        double litresNeeded = sizeInLitres * (1 - percent/100);

        System.out.println(litresNeeded);


    }
}
