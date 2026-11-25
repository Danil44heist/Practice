package homework4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void printFactorial(Scanner scanner) {
        int n = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void printEvenNumber(Scanner scanner) {
        int n = scanner.nextInt();
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void backwordPrint(Scanner scanner) {
        int number  = scanner.nextInt();
        int i = 1;
        if (number >= 1) {
            while (number >= i) {
                System.out.println(number);
                number--;
            }
        } else System.out.println("Введите положительно число");
    }
}
