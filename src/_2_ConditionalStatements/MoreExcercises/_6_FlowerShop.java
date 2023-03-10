package _2_ConditionalStatements.MoreExcercises;

import java.util.Scanner;

public class _6_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //въвеждаме данните
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        //изчисляваме цените на отделните продукти
        double magnoliasPrice = magnolias * 3.25;
        double hyacinthsPrice = hyacinths * 4;
        double rosesPrice = roses * 3.5;
        double cactiPrice = cacti * 8;

        //изчисляваме цялата цена
        double totalPrice = magnoliasPrice + hyacinthsPrice + rosesPrice + cactiPrice;
        //изваждаме 5% от цялата цена (данъци)
        totalPrice -= totalPrice * 0.05;
        double diff = Math.abs(totalPrice - giftPrice);

        if (totalPrice >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }
    }
}
