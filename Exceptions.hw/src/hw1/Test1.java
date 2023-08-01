package hw1;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//
//Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//
//Метод divisionByZero - Деление на 0
//
//Метод numberFormatException - Ошибка преобразования строки в число
//
//Важно: они не должны принимать никаких аргументов
public class Test1 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
    static class Answer {
        public static void arrayOutOfBoundsException() {
            int[] nums = new int[10];
            int a = nums[11];

        }

        public static void divisionByZero() {
            int a = 10;
            int b = 0;
            int result = a / b;

        }

        public static void numberFormatException() {
            int number = Integer.parseInt("ASD");

        }
    }
}

