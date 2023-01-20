package _1_FirstStepsInCoding.MoreExercices;

import java.util.Scanner;

public class _6_Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float priceForKgMackerel = Float.parseFloat(scanner.nextLine());
        float priceForKgSprinkle = Float.parseFloat(scanner.nextLine());
        float KgBonito = Float.parseFloat(scanner.nextLine());
        float KgScad = Float.parseFloat(scanner.nextLine());
        byte KGMussels = Byte.parseByte(scanner.nextLine());


        double priceOfBonito = priceForKgMackerel + priceForKgMackerel * 0.60;
        double totalPriceBonito = KgBonito * priceOfBonito;
        double priceOfScad = priceForKgSprinkle + priceForKgSprinkle * 0.80;
        double totalPriceScad = KgScad * priceOfScad;
        double priceOfMussel = KGMussels * 7.50;

        double totalPrice = totalPriceBonito + totalPriceScad + priceOfMussel;

        System.out.printf("%.2f", totalPrice);


    }
}
/*
        ⦁	Рибна борса
             Георги ще има гости вечерта и решава да ги нагости с паламуд, сафрид и миди. Затова отива на рибната борса,
        за да си купи по няколко килограма. Oт конзолата се въвеждат цените в лева на скумрията и цацата.
       Също количеството на паламуд, сафрид и миди в килограми.
         Колко пари ще са му необходими, за да плати сметката си, ако цените на борсата са:
        ⦁	Паламуд – 60% по-скъп от скумрията
        ⦁	Сафрид – 80% по-скъп от цацата
        ⦁	Миди – 7.50 лв. за килограм

            Вход
            От конзолата се четат 5 числа:
            ⦁	Първи ред – цена на скумрията на килограм. Реално число в интервала [0.00…40.00]
            ⦁	Втори ред – цена на цацата на килограм. Реално число в интервала [0.00…30.00]
            ⦁	Трети ред – килограма паламуд. Реално число в интервала [0.00…50.00]
            ⦁	Четвърти ред – килограма сафрид. Реално число в интервала [0.00… 70.00]
            ⦁	Пети ред – килограма миди. Цяло число в интервала [0 ... 100]
Изход
Да се отпечата на конзолата едно число с плаваща запетая:
колко пари ще са нужни на Георги, за да си плати сметката.
Числото трябва да е форматирано до вторият знак след десетичната запетая (1.2457 -> 1.25).

            Примерен вход и изход
            Вход	Изход
            6.90
            4.20
            1.5
            2.5
            1	    42.96

            Цена на паламуда = 6.90 + 6.90 * 0.60 = 11.04 лв. за килограм
            Сума паламуд = 1.5 * 11.04 = 16.56
            Цена на сафрид = 4.20 + 4.20 * 0.80 =  7.56 лв. за килограм
            Сума сафрид = 2.5 * 7.56 = 18.90
            Сума миди = 1 * 7.50 = 7.50
            Сметка = 16.56 + 18.90 + 7.50 = 42.96

 */