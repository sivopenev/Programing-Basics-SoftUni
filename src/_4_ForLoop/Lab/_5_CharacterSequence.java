package _4_ForLoop.Lab;

import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        // Принтва чар на отделен ред (текст)

        for (int i = 0; i < text.length(); i++) {

            System.out.println(text.charAt(i));

        }
    }
}
