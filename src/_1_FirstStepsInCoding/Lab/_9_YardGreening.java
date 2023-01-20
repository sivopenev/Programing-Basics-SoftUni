package _1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*

        Напишете програма, която изчислява необходимате сума,
        които Божидара ще трябва да заплати на фирмата изпълнител на проекта.

        Цената на един кв. м. е 7.61 лв със ДДС.
        Понеже нейният двор е доста голям, фирмата изпълнител предлага 18% отстъпка от крайната цена.

        Вход:

            От конзолата се прочита само един ред:
                ⦁	Кв. метри, които ще бъдат озеленени – реално число в интервала [0.00 … 10000.00]

        Изход:

            На конзолата се отпечатват два реда:
                ⦁	"The final price is: {крайна цена на услугата} lv."
                ⦁	"The discount is: {отстъпка} lv."
        */

        double squareMeters = Double.parseDouble(scanner.nextLine());

        double priceForSquareMeter = 7.61;
        double discount = 0.18;
        double finalPriceForYardGreening = squareMeters * priceForSquareMeter;
        double totalDiscount = finalPriceForYardGreening * discount;
        double totalPriceWithDiscount = finalPriceForYardGreening - (finalPriceForYardGreening * discount);


        System.out.println("The final price is: " + totalPriceWithDiscount + " lv.");
        System.out.println("The discount is: " + totalDiscount + " lv.");

    }
}
