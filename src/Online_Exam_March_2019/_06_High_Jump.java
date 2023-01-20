package Online_Exam_March_2019;

import java.util.Scanner;

public class _06_High_Jump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hightGoal = Integer.parseInt(scanner.nextLine());
        int startHigh = hightGoal - 30; // Летвата се слага 30 см по-ниско от височината, която Тихомир иска да скочи.

        int failCount = 0;  // Брояч на неуспешни опити
        int countJumps = 0; // Брояч на прой скокове общо


        while (true) {
            int currentJump = Integer.parseInt(scanner.nextLine());
            countJumps++; // след всеки опит се отбелязва +1 скок и се слага преди проверките (в случея),
            // за да няма при достигане на целта (или недостигане) грешно отчитане на опитите.

            if (currentJump > startHigh) {
                // Провеката пита дали текущият скок е по-висок
                // от началното ниво на летвата, към което след всеки успешен скок се прибавят 5 см.

                if (startHigh == hightGoal) {  // тук се проверява дали е достигната целта на Тихомир
                    System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", startHigh, countJumps);
                    break;
                }

                startHigh += 5; // При успрешен скок се прибавят 5см към летвата (стартовата височина, която се покачва)
                failCount = 0; // стойността на грешните опити се нулира при всеки успешен скок,
                // защото по правило след 2 неуспешни и 1 успешен, имате отново 3 опита за скок.

            } else if (failCount < 2) { // проверка дали неуспешните опити са станали 3.
                // В случея, ако опита е неуспешен, в горната проверка currentJump > startHigh излиза false
                // и се влиза в тази. Съответно се отбелязва един неуспешен опит.
                failCount++;

            } else { // при 3ти неупешен опит, горните проверки са фолс и се влиза в тази.
                System.out.printf("Tihomir failed at %dcm after %d jumps.", startHigh, countJumps);
                break;
            }
        }
    }
}

