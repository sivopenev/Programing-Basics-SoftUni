package MyPrograms;

import java.util.Scanner;

public class _2_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Извеждащо меню в стринг масив (Array)
        String[] options = {
                "Press \"1\" to add money!",
                "Press \"2\" to withdraw money!",
                "Press \"3\" for current account balance!",
                "Press \"4\" to see last transactions info!",
                "Press \"5\" to exit!"};

        for (int i = 0; i < options.length; i++) {
            String menu = options[i];    // С този фор цикъл извиквам извеждащото меню
            System.out.println(menu);   // изписването е по оптимизираният начин. Може да се върне в класическият си вид от опциите вляво.
        }

        int balance = 0;
        int lastAdded = 0;
        int lastWithdrawn = 0;
        boolean wrongInput = false;  // булева променлива, която ще използвам за илизане от фор цикъл, ако не са въведени цифри

        for (int i = 0; true; i++) {

            String inputMenu = scanner.nextLine();

            // в този фор цикъл се проверява дали инпута е различен от числа
            // (ограничава се юзера, иначе се счупи програмата)
            for (int y = 0; y < inputMenu.length(); y++) {
                char c = inputMenu.charAt(y);
                boolean checker = Character.isLetter(inputMenu.charAt(y));
                switch (inputMenu.charAt(y)) {
                    case
                            '+', '-', '"', '§', '$', '%', '&',
                            '/', '(', ')', '=', '?', '!', '`',
                            ':', ';', '*', '~', ' ', ',', '.',
                            '#', '_', 'ß', 'Ü', 'Ö', 'Ä', '°',
                            '^', '\'', 'µ', '>', '<', '|', '@',
                            '[', ']', '{', '}', '´', '€' -> wrongInput = true;
                }

                // ако е въведено нещо различно от цифра, булевата минава в тру
                // и излиза от цикъла, за да влезе долу в иф проверката
                if (checker) {
                    wrongInput = true;
                    break;
                }
            }
            // Проверка за празен инпут (има разлика с въвеждане на отстояние със спейс и само ентер)
            if (inputMenu.isBlank()) {
                wrongInput = true;
            }

            // когато проверката е тру и влезем в нея, след принта булевата трябва отново да се върне на false
            // за да не влиза постояно в нея и да връща цикъла.
            if (wrongInput) {
                System.out.println("Please use only digits!");
                for (String menu : options) {
                    System.out.println(menu);
                }
                wrongInput = false;
                continue; // c continue връщаме основният фор цикъл.
            }

            int input = Integer.parseInt(inputMenu); // преобразува стринга в числа

            // с тази проверка се ограничава въвеждането на различни от менюто цифри
            if (input > 5) {
                System.out.println("Please choose from the following options: ");
                for (String menu : options) { // този фор цикъл изпринтва цялото меню както по-горе.
                    System.out.println(menu);
                }
            }

            if (input == 1) {
                System.out.println("Please enter the amount: ");
                // Същата проверка както горе на основното меню
                inputMenu = scanner.nextLine();


                for (int y = 0; y < inputMenu.length(); y++) {
                    char c = inputMenu.charAt(y);
                    boolean checker = Character.isLetter(inputMenu.charAt(y));
                    switch (inputMenu.charAt(y)) {
                        case
                                '+', '-', '"', '§', '$', '%', '&',
                                '/', '(', ')', '=', '?', '!', '`',
                                ':', ';', '*', '~', ' ', ',', '.',
                                '#', '_', 'ß', 'Ü', 'Ö', 'Ä', '°',
                                '^', '\'', 'µ', '>', '<', '|', '@',
                                '[', ']', '{', '}', '´', '€' -> wrongInput = true;
                    }
                    if (checker) {
                        wrongInput = true;
                        break;
                    }
                }
                if (inputMenu.isBlank()) {
                    wrongInput = true;
                }
                if (wrongInput) {
                    System.out.println("Please use only digits!");
                    for (String menu : options) {
                        System.out.println(menu);
                        wrongInput = false;
                    }
                    continue;
                }

                //този инпут преобразува стринга горе в число и го добавя в баланса по сметка.

                input = Integer.parseInt(inputMenu);
                balance += input;
                lastAdded = input;
                System.out.println(input + " leva added to your account!");
                // отново извикваме главното меню от горе.
                for (String option : options) {
                    System.out.println(option);
                }


                // Същата проверка като горе
            } else if (input == 2) {
                System.out.println("Please enter the amount you want to withdraw: ");
                inputMenu = scanner.nextLine();
                int y = 0;
                while (true) {
                    if (y >= inputMenu.length()) break;
                    char c = inputMenu.charAt(y);
                    boolean checker = Character.isLetter(inputMenu.charAt(y));
                    switch (inputMenu.charAt(y)) {
                        case
                                        '+', '-', '"', '§', '$', '%', '&',
                                        '/', '(', ')', '=', '?', '!', '`',
                                        ':', ';', '*', '~', ' ', ',', '.',
                                        '#', '_', 'ß', 'Ü', 'Ö', 'Ä', '°',
                                        '^', '\'', 'µ', '>', '<', '|', '@',
                                        '[', ']', '{', '}', '´', '€' -> wrongInput = true;
                    }
                    if (checker) {
                        wrongInput = true;
                        break;
                    }
                    y++;
                }
                if (inputMenu.isBlank()) {
                    wrongInput = true;
                }
                if (wrongInput) {
                    System.out.println("Please use only digits!");
                    for (String menu : options) {
                        System.out.println(menu);
                        wrongInput = false;
                    }
                    continue;
                }

                input = Integer.parseInt(inputMenu);
                balance -= input;
                // Проверка, която да не запише в последни трансакции сума,
                // която е по-голяма от наличната по сметка и да излезе, че сте изтеглили несъществуващи пари.
                if (balance > 0) {
                    lastWithdrawn = input;
                }
                // при въвеждане на сума, която при изваждане отива в минус, се изписва, че няма наличност
                // и трябва да се прибави обратно числото към сметката, за да върне първоначалната стойност.
                // т.е ако има 10 лв по сметка, ако искате да извадите 50, ще изпише че няма наличност, но в
                // текущата сметка, ако не върнем въведената стойност ще излезе -40.

                if (balance < 0) {
                    balance += input;
                    System.out.println("You don't have enough funds!");
                    System.out.println("Current balance: " + balance + " leva!");
                } else {
                    System.out.println(input + " leva withdrawn from your account!"); // съответно ако имате наличност я изважда
                }
                // извеждаме отново основното меню
                for (String option : options) {
                    System.out.println(option);
                }

            } else if (input == 3) { // текущ баланс по сметка.
                System.out.printf("Current account balance: %d leva!%n", balance);
                for (String menu : options) {
                    System.out.println(menu);
                }
            } else if (input == 4) {  // инфо за последна активност по сметка.
                System.out.println("Last added: " + lastAdded + " leva!");
                System.out.println("Last withdrawn: " + lastWithdrawn + " leva!");
                for (String option : options) {
                    System.out.println(option);
                }

            } else if (input == 5) {
                System.out.println("Thank you for using this ATM machine! Goodbye!");
                break;
            }
        }
    }
}


