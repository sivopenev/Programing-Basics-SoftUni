package MyPrograms;

public class Math_Ceiling_After_Decimal_Point {

    public static void main(String[] args) {

        int integer = 12345 % 10; // изкарва последната цифра на цялото число -> 5
        System.out.println(integer);

        double number = 123.4567 % 10; // изкарва последното число преди десетичната запетая -> 3.456699999999998
        System.out.println(number);

        System.out.println(Math.ceil(number * 100) / 100); // Закръгля след десетичната запетая -> 3.46 (второто число ако множим на 100)

        System.out.println(Math.ceil(number)); //Закръгля до цялото число до съседната стойност -> 4.0


    }

}
