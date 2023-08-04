package hw3.Task1;

// Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет все операции
// операции(+, -, '', /) и возведения первого числа в степень второго числа.
// Если введены некорректные числа или происходит деление на ноль, необходимо обработать
// соответствующие исключения и вывести информативное сообщение об ошибке.
// Важно! С использованием принципа одного уровня абстракции!
// *В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(),
// выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и
// отрицательная степень, выбрасывается исключение InvalidInputException.
//
// В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower()
// и выводим результат. Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения
// перехватываются и выводится информативное сообщение об ошибке.
//
// Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно
// указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**

import hw3.Task1.PowerCalculator;

public class Calculator {
    public static void main(String[] args) {

        try{
            System.out.println(divide(1, 0));
        } catch (Exception e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        try{
            System.out.println(multiply(5, 10));
        } catch (Exception e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        try{
            System.out.println(subtract(10, 5));
        } catch (Exception e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        try{
            System.out.println(sum(10, 5));
        } catch (Exception e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

        try{
            System.out.println(PowerCalculator.calculatePower(2, -4));
        } catch (Exception e){
            System.out.println("Произошла ошибка: " + e.getMessage());
        }

    }

    public static double divide(double a, double b) {
        if(b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }

    public static double multiply(double a, double b) {
        if(a > Double.MAX_VALUE / b) throw  new ArithmeticException("Double type overflow");
        return a * b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

}
