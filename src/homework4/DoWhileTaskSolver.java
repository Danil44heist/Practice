package homework4;

import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void requestPositiveNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Введите положительное число: ");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    public static void checkPassword(Scanner scanner) {
        int password;
        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextInt();
        } while (!(password == 1234));
    }

    public static void printFrom1To10() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void exitWaiting(Scanner scanner) {
        String input;
        do {
            input = scanner.nextLine();
        } while (!(input.equals("exit")));
    }

    public static int numberCounter(Scanner scanner) {
        int n = scanner.nextInt();;
        int count = 0;
        do {
            n = n / 10;
            count++;
        } while (n > 0);
        return count;
    }
}
