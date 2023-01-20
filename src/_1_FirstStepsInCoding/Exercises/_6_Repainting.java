package _1_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class _6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         1. Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
         2. Необходимо количество боя (в литри) - цяло число в интервала [1…100]
         3. Количество разредител (в литри) - цяло число в интервала [1…30]
         4. Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]

         Сума за найлон: (10 + 2) * 1.50 = 18 лв.
         Сума за боя: (11 + 10%) * 14.50 = 175.45 лв.
         Сума за разредител: 4 * 5.00 = 20.00 лв.
         Сума за торбички: 0.40 лв.

         Обща сума за материали: 18 + 175.45 + 20.00 + 0.40 = 213.85 лв.
         Сума за майстори: (213.85 * 30%) * 8 = 513.24 лв.
         Крайна сума: 213.85 + 513.24 = 727.09 лв.
         */
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());
        double bags = 0.40;

        double sumForNylon = (nylon + 2) * 1.50;                 // (10 + 2) * 1.50 = 18 лв.
        double sumForPaint = (paint + (paint * 0.1)) * 14.50;   // (11 + 10%) * 14.50 = 175.45 лв.
        double sumForDiluent = diluent * 5.00;                 // 4 * 5.00 = 20.00 лв.

        double sumForMaterials = sumForNylon + sumForPaint + sumForDiluent + bags; // 18 + 175.45 + 20.00 + 0.40 = 213.85 лв.
        double sumWorkers = (sumForMaterials * 0.3) * workHours;                          // (213.85 * 30%) * 8 = 513.24 лв.
        double totalSum = sumForMaterials + sumWorkers;                          // Крайна сума: 213.85 + 513.24 = 727.09 лв.

        System.out.println(totalSum);


    }
}
