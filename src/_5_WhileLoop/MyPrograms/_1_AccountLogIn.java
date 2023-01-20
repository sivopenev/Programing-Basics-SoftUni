package _5_WhileLoop.MyPrograms;

import java.util.Scanner;

public class _1_AccountLogIn {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Hello! Create your username: ");
        String username = consoleInput.nextLine();
        while (username.isBlank()) {
            System.out.println("Username can not be blank! Create your username:");
            username = consoleInput.nextLine();
        }
        System.out.println("Create your password: ");
        String password = consoleInput.nextLine();

        while (password.length() <= 3) {
            System.out.println("Password can not be less than 4 characters! Create password: ");
            password = consoleInput.nextLine();
        }

        System.out.println("Enter your username to log in: ");
        String inputUsername = consoleInput.nextLine();
        int wrongPassCounter = 2;


        while (!username.equals(inputUsername)) {

            if (inputUsername.isEmpty()) {
                System.out.println("Username can not be blank! Enter your username:");
            } else {
                System.out.println("Unknown username! Enter your username: ");
            }

            inputUsername = consoleInput.nextLine();
        }

        System.out.printf("Hello %s! Enter your password: ", inputUsername);
        String inputPassword = consoleInput.nextLine();

        while (inputPassword.isBlank()) {
            System.out.println("Password can not be blank! Enter your password: ");
            inputPassword = consoleInput.nextLine();
        }

        while (!inputPassword.equals(password)) {

            while (inputPassword.isBlank()) {
                System.out.println("Password can not be blank! Enter your password: ");
                inputPassword = consoleInput.nextLine();

            }
            if (wrongPassCounter == 0) {
                System.out.println("Your account has been locked due to numerous failed log in attempts!");
                break;
            }


            System.out.printf("Invalid password! %d attempts left!%nEnter your password: ", wrongPassCounter);
            wrongPassCounter--;
            inputPassword = consoleInput.nextLine();

        }

        if (inputPassword.equals(password)) {

            System.out.printf("Welcome %s!", username);
        }

    }
}
