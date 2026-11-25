package homework4;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static String dayOfWeek(Scanner scanner) {
        System.out.print("Введите число: ");
        int dayNumber = scanner.nextInt();
        String dayName = "";
        switch (dayNumber) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Несуществующий день недели";

        }
        return dayName;

    }

    public static String ticketPrice(Scanner scanner) {
        System.out.print("Введите день недедли: ");
        int dayWeek = scanner.nextInt();
        String priceRub = "";
        switch (dayWeek) {
            case 1, 2, 3, 4, 5:
                priceRub = "300 рублей";
                break;
            case 6, 7:
                priceRub = "450 рублей";
                break;
        }
        return priceRub;
    }

    public static String gradeAtoF(Scanner scanner) {
        System.out.print("Введите оценку в 100-бальной системе: ");
        int scope = scanner.nextInt();
        String grade = "";
        switch (scope / 10) {
            case 9, 10:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        return grade;
    }

    public static String commandProcessing(Scanner scanner) {
        String command = scanner.nextLine();
        String message = "";
        switch (command) {
            case "start":
                message = "Система запущена";
                break;
            case "stop":
                message = "Система остановлена";
                break;
            case "restart":
                message = "Система перезапущена";
                break;
            case "status":
                message = "Статус системы";
                break;
            default:
                message = "Неизвестная команда";
        }
        return message;
    }

    public static void simpleCalculator(Scanner scanner) {
        System.out.print("Введите первое число: ");
        double numberA = scanner.nextInt();
        System.out.print("Введите второе число: ");
        double numberB = scanner.nextInt();
        System.out.print("Введите оператор: ");
        String operator = scanner.next();
        double result = 0.0;
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            if (!(numberB == 0 && operator.equals("/"))) {
                result = switch (operator) {
                    case "+" -> numberA + numberB;
                    case "-" -> numberA - numberB;
                    case "*" -> numberA * numberB;
                    case "/" -> (double) numberA / numberB;
                    default -> result;
                };
                System.out.println(result);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else System.out.println("Некорректный оператор");
    }
}
