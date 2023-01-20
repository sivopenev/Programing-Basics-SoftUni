package _5_WhileLoop.Excercises;

import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int hightFreeSpace = Integer.parseInt(scanner.nextLine());


        int availableSpace = widthFreeSpace * lengthFreeSpace * hightFreeSpace;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int box = Integer.parseInt(command);
            availableSpace -= box;

            if (availableSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(availableSpace));
                break;
            }

            command = scanner.nextLine();
        }
        if (availableSpace > 0) {
            System.out.printf("%d Cubic meters left.", availableSpace);
        }

    }
}
