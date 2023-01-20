package Online_Exam_July_2020;

import java.util.Scanner;

public class _5_Best_Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String playersName = scanner.nextLine();

        String bestPlayer = "";
        int mostGoals = 0;


        while (!playersName.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals >= 10) {
                mostGoals = goals;
                bestPlayer = playersName;
                break;

            } else if (goals > mostGoals) {
                mostGoals = goals;
                bestPlayer = playersName;

            }
            playersName = scanner.nextLine();
        }

        if (mostGoals >= 3) {
            System.out.printf("%s is the best player!\n" +
                    "He has scored %d goals and made a hat-trick !!!", bestPlayer, mostGoals);
        } else {
            System.out.printf("%s is the best player!\n" +
                    "He has scored %d goals.", bestPlayer, mostGoals);
        }
    }
}
