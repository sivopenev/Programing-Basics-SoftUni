package Online_Exam_March_2019;

import java.util.Scanner;

public class _05_Fitness_Center {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fitnessVisitors = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;
        int peopleTraining = 0;
        int boughtProducts = 0;

        for (int i = 0; i < fitnessVisitors; i++) {

            String typeOfActivity = scanner.nextLine();

            switch (typeOfActivity) {
                case "Back": {
                    back++;
                    peopleTraining++;
                }
                break;
                case "Chest": {
                    chest++;
                    peopleTraining++;
                }
                break;
                case "Legs": {
                    legs++;
                    peopleTraining++;
                }
                break;
                case "Abs": {
                    abs++;
                    peopleTraining++;
                }
                break;
                case "Protein shake": {
                    proteinShake++;
                    boughtProducts++;
                }
                break;
                case "Protein bar": {
                    proteinBar++;
                    boughtProducts++;
                }
            }
        }

        double trainingPeoplePercentage = 1.0 * peopleTraining / fitnessVisitors * 100;
        double boughtProductsPercentage = 1.0 * boughtProducts / fitnessVisitors * 100;

        System.out.printf("%d - back%n",back);
        System.out.printf("%d - chest%n",chest);
        System.out.printf("%d - legs%n",legs);
        System.out.printf("%d - abs%n",abs);
        System.out.printf("%d - protein shake%n",proteinShake);
        System.out.printf("%d - protein bar%n",proteinBar);
        System.out.printf("%.2f%% - work out%n",trainingPeoplePercentage);
        System.out.printf("%.2f%% - protein",boughtProductsPercentage);

    }
}
