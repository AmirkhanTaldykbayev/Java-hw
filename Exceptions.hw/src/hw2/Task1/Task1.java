package hw2.Task1;

import java.util.Scanner;

// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
// с сообщением "Некорректное число". В противном случае программа должна выводить сообщение "Число корректно".
public class Task1 {

    public static int setNumber(Scanner scan) throws InvalidNumberException {
        System.out.println("Введите число: ");
        int number = Integer.parseInt(scan.nextLine());
        if(number <= 0){
            throw new InvalidNumberException("Число меньше или равно нулю");
        }
        System.out.println("Число " + number +  " корректно");
        return number;
    }

    public static void main(String[] args)  {
        try {
            setNumber(new Scanner(System.in));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


