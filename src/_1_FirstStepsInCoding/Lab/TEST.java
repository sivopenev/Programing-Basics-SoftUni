package _1_FirstStepsInCoding.Lab;


import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMetres = Double.parseDouble(scanner.nextLine());

        double squareMetrePrice = 7.61;
        double totalPrice = squareMetres * squareMetrePrice;
        double discount = totalPrice * 0.18;
        double totalWithDiscount = totalPrice - discount;

        System.out.println("The final price is: " + totalWithDiscount + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}
