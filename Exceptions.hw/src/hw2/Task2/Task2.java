package hw2.Task2;

import java.util.Scanner;

// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление
// с сообщением "Деление на ноль недопустимо". В противном случае программа должна выводить результат деления.
// Обратите внимание, что в обеих задачах используются собственные исключения, которые наследуются от класса Exception.
// Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.
//Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
public class Task2 {
    public static double division(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите делимое число: ");
            double dividend = Double.parseDouble(scan.nextLine());
            System.out.println("Введите делитель: ");
            double divisor = Double.parseDouble(scan.nextLine());
            double result = division(dividend, divisor);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Введите число");
        }
    }
}
