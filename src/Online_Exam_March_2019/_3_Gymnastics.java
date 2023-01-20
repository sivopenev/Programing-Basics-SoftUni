package Online_Exam_March_2019;

import java.util.Scanner;

public class _3_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String country = scanner.nextLine();
        String gymAppliance = scanner.nextLine();

        double totalPoints = 0;
        double maxPoints = 20;

        switch (country) {

            case "Russia": {
                switch (gymAppliance) {
                    case "ribbon": {
                        totalPoints += 18.500;
                    }
                    break;

                    case "hoop": {
                        totalPoints += 19.100;
                    }
                    break;
                    case "rope": {
                        totalPoints += 18.600;
                    }
                    break;
                }
            }
            break;

            case "Bulgaria": {
                switch (gymAppliance) {
                    case "ribbon": {
                        totalPoints += 19.000;
                    }
                    break;

                    case "hoop": {
                        totalPoints += 19.300;
                    }
                    break;
                    case "rope": {
                        totalPoints += 18.900;
                    }
                    break;
                }

                break;

            }
            case "Italy": {
                switch (gymAppliance) {
                    case "ribbon": {
                        totalPoints += 18.700;
                    }
                    break;

                    case "hoop": {
                        totalPoints += 18.800;
                    }
                    break;
                    case "rope": {
                        totalPoints += 18.850;
                    }
                    break;
                }

            }
        }
        double pointsToMax = maxPoints - totalPoints;
        double percentToMaxPoints = (pointsToMax/maxPoints) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n",country,totalPoints,gymAppliance);
        System.out.printf("%.2f%%",percentToMaxPoints);

    }
}
