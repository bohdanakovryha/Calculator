package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            System.out.print("Введіть операцію (+, -, *, /, sqrt (перше число)): ");
            String operation = scanner.next();

            double result = 0;
            switch (operation) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                case "sqrt":
                    result = calculator.sqrt(num1);
                    break;
                default:
                    System.out.println("Невідома операція!");
                    return;
            }
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Невірний ввід: Будь ласка, введіть коректні числа.");
        } finally {
            System.out.println("Обробка запиту завершена.");
            scanner.close();
        }
    }
}
