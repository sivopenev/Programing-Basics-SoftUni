package _4_ForLoop.MoreExcercises;

public class _10_Clock_part_2 {
    public static void main(String[] args) {

        for (int hours = 0; hours <= 24; hours++) {
            for (int minutes = 0; minutes <= 60; minutes++) {
                for (int seconds = 0; seconds <= 60; seconds++) {

                    if (seconds == 60) {
                        seconds = 0;
                        minutes++;
                    }
                    if (minutes == 60) {
                        minutes = 0;
                        hours++;
                    }
                    if (hours == 24) {
                        return;
                    }
                    System.out.printf("%d : %d : %d%n", hours, minutes, seconds);
                }
            }
        }
    }
}
