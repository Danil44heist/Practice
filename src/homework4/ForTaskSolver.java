package homework4;

import java.util.Scanner;

public class ForTaskSolver {
    public static void printDiv3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sum1toN(Scanner scanner) {
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printMultiplyTabel(Scanner scanner) {
        int input = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }

    public static boolean isPrime(Scanner scanner) {
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void print1to10(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

}
