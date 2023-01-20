package _1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class _7_ProjectCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numOfProjectToBeDone = Integer.parseInt(scanner.nextLine());
        int hoursToComplete = numOfProjectToBeDone * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursToComplete, numOfProjectToBeDone);
    }
}
