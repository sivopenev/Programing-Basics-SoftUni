package _5_WhileLoop.Excercises;

import java.util.Scanner;

public class _6_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWight = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());

        int cakeSize = cakeWight * cakeLength;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int cakePieceSize = Integer.parseInt(command);
            cakeSize -= cakePieceSize;

            if (cakeSize <= 0) {

                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
                break;
            }


            command = scanner.nextLine();
        }
        if (cakeSize >= 0) {
            System.out.printf("%d pieces are left.", cakeSize);
        }
    }
}
