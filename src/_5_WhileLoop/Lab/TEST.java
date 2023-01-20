package _5_WhileLoop.Lab;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        System.out.println("Hello! Create your username: ");
        String username = consoleInput.nextLine();
        System.out.println("Create your password: ");
        String password = consoleInput.nextLine();

        while (password.isEmpty()){
            System.out.println("Password can not be empty! Create password: ");
            password=consoleInput.nextLine();
        }

        System.out.println("Log in: Enter your username: ");
        String inputUsername = consoleInput.nextLine();
        int wrongPass = 2;


        while (!username.equals(inputUsername)) {
            System.out.println("Unknown username! Enter your username: ");
            inputUsername = consoleInput.nextLine();
        }

        System.out.printf("Hello %s! Enter your password: ", inputUsername);
        String inputPassword = consoleInput.nextLine();

        while(inputPassword.isEmpty()){
            System.out.println("Password can not be empty! Enter your password: ");
            inputPassword = consoleInput.nextLine();
        }

        while (!inputPassword.equals(password)) {

            while(inputPassword.isEmpty()){
                System.out.println("Password can not be empty! Enter your password: ");
                inputPassword = consoleInput.nextLine();
            }

            if(wrongPass==0){
                System.out.println("Your account has been locked due to numerous failed log in attempts!");
                break;
            }
            System.out.printf("Wrong password! %d attempts left!%nEnter your password: ",wrongPass);
            wrongPass--;
            inputPassword = consoleInput.nextLine();
        }

        if(inputPassword.equals(password)){
            System.out.printf("Welcome %s!", username);
        }

    }

}
