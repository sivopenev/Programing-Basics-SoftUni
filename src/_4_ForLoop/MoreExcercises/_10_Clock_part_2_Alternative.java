package _4_ForLoop.MoreExcercises;

public class _10_Clock_part_2_Alternative {
    public static void main(String[] args) {

        int hours = 0;
        int minutes = 0;

        for (int seconds = 0; true; seconds++) {

            if (seconds > 59) {
                seconds = 0;
                minutes++;
            }
            if (minutes > 59) {
                minutes = 0;
                hours++;
            }
            if (hours > 23) {
                break;
            }
            System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
        }
    }
}
