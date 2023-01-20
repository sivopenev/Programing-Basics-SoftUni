package Online_Exam_March_2019;

import java.util.Scanner;

public class _2_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minutesControl = Integer.parseInt(scanner.nextLine());
        int secondsControl = Integer.parseInt(scanner.nextLine());
        double hiveLength = Double.parseDouble(scanner.nextLine());
        int secondsPer100Metres = Integer.parseInt(scanner.nextLine());


        double controlTimeInSeconds = minutesControl * 60 + secondsControl;
        double delay = (hiveLength / 120) * 2.5;
        double martinsTime = (hiveLength / 100) * secondsPer100Metres - delay;

        if (martinsTime < controlTimeInSeconds){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",martinsTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.",martinsTime - controlTimeInSeconds);
        }

    }
}
