package _1_FirstStepsInCoding.MoreExercices;

import java.util.Scanner;

public class _1_TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      /**
        Напишете програма, която чете от конзолата три дробни числа
        b1, b2 и h и пресмята лицето на трапец с основи b1 и b2 и височина h.

        Формулата за лице на трапец е (b1 + b2) * h / 2.
        На фигурата по-долу е показан трапец със страни 8 и 13 и височина 7.
        Той има лице (8 + 13) * 7 / 2 = 73.5
        Отговорът трябва да е форматиран до втората цифра след десетичния знак.
         **/

        float b1 = Float.parseFloat(scanner.nextLine());
        float b2 = Float.parseFloat(scanner.nextLine());
        float h =  Float.parseFloat(scanner.nextLine());

        float trapezoidArea = (b1+b2) * h/2;

        System.out.printf("%.2f",trapezoidArea);

    }

}
