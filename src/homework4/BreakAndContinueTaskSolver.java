package homework4;

import java.util.Scanner;

public class BreakAndContinueTaskSolver {

    public static int sumOfNumbers(Scanner scanner) {
        int sum = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number >= 0) {
                sum = sum + number;
            } else break;
        }
        return sum;
    }

    public static void SkipNumbersDiv3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printOnlyPositiveNumbers(Scanner scanner) {
        while (true) {
            int number = scanner.nextInt();
            if (number <= 0) {
                continue;
            }
            System.out.println(number);
        }
    }

    public static void waitStopComand(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
        }
    }
}
