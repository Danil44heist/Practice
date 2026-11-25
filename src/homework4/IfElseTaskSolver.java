package homework4;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static String numberSign(Scanner scanner) {
        String numberSign = "Число равно нулю";
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            numberSign = "Число положительное";
        } else if (number < 0) {
            numberSign = "Число отрицательное";
        }
        return numberSign;
    }

    public static int finaMax(Scanner scanner) {
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        int max = Math.max(number1, number2);
        return max;

    }

    public static String gradeDescription(Scanner scanner) {
        String gradeDescription = "Некорректная оценка";
        System.out.print("Введите оценку: ");
        int gradeNumber = scanner.nextInt();
        if (gradeNumber == 5) {
            gradeDescription = "Отлично";
        } else if (gradeNumber == 4) {
            gradeDescription = "Хорошо";
        } else if (gradeNumber ==3) {
            gradeDescription = "Удовлетворительно";
        } else if (gradeNumber == 2 || gradeNumber == 1) {
            gradeDescription = "Неудовлетворительно";
        }
        return gradeDescription;
    }

    public static String parityCheck(Scanner scanner) {
        System.out.print("Введите число: ");
        String isParity = "Нечетное";
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            isParity = "Четное";
        }
        return isParity;
    }

    public static String checkDiscount(Scanner scanner) {
        System.out.print("Введите возвраст: ");
        int age = scanner.nextInt();
        String discount = "без скидки";
        if (age < 18) {
            discount = "25%";
        } else if (age >= 65) {
            discount = "30%";
        }
        return discount;
    }

    public static String testResult(Scanner scanner) {
        String grade = "";
        System.out.print("Введите результат теста в баллах: ");
        int result = scanner.nextInt();
        if (result >= 90 && result <= 100) {
            grade = "Отлично";
        } else if (result >= 75 && result <= 89) {
            grade = "Хорошо";
        } else if (result >= 60 && result <= 74) {
            grade = "Удовлетворительно";
        } else if (result >= 0 && result <=60) {
            grade = "Неудовлетворительно";
        } else grade = "Некорректная количество баллов";
        return grade;
    }
}
