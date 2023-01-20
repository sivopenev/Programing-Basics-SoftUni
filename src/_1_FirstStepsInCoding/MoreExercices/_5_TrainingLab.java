package _1_FirstStepsInCoding.MoreExercices;

import java.util.Scanner;

public class _5_TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме данните от входа
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        //Изчисляваме w = дължина h = широчина
        int workPlaceW = 120;
        int workPlaceH = 70;
        int corridorH = 100;
        double wCm = w * 100;
        double hCm = h * 100;
        double clearH = hCm - corridorH;
        double workStationsH = Math.floor(clearH / workPlaceH);
        double workStationsW = Math.floor(wCm / workPlaceW);
        double numWorkStations = workStationsH * workStationsW - 3;
        int numWorkStationsInt = (int) Math.round(numWorkStations);
        System.out.println(numWorkStationsInt);


    }
}
