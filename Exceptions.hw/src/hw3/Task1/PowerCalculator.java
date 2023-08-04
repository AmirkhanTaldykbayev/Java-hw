package hw3.Task1;

import hw2.Task1.InvalidNumberException;

public class PowerCalculator {
    public static double calculatePower(double a, double b) throws InvalidNumberException {
        if(b <= 0) throw new InvalidNumberException("Некорректная степень возведения!");

        double temp = a;
        for (int i = 1; i < b; i++) {
            temp *= a;
        }
        return temp;
    }
}
