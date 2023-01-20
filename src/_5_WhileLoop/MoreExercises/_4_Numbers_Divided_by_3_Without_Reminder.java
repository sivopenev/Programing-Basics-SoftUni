package _5_WhileLoop.MoreExercises;

public class _4_Numbers_Divided_by_3_Without_Reminder {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
