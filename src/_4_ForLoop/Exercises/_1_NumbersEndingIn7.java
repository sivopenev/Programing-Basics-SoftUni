package _4_ForLoop.Exercises;

public class _1_NumbersEndingIn7 {
    public static void main(String[] args) {

        for (int i = 7; i < 997; i++) {

            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}

