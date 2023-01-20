package _1_FirstStepsInCoding.Exercises;

// import java.text.DecimalFormat;
import java.util.Scanner;

public class _1_UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.994993;


        System.out.println(bgn);
    }
}
