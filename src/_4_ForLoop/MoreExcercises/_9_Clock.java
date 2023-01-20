package _4_ForLoop.MoreExcercises;

public class _9_Clock {
    public static void main(String[] args) {
        int hours = 0;

        for (int minutes = 0; true; minutes++) {
            if (minutes > 59) {
                minutes = 0;
                hours++;
            }
            if (hours > 23) {
                break;
            }
            System.out.printf("%d : %d%n", hours, minutes);
        }
    }
}
