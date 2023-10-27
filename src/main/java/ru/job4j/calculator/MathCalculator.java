package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDiffDiv(double first, double second) {
        return diff(first, second)
                + division(first, second);
    }

    public static double sumMultiplyDiffDiv(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + diff(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета sumDiffDiv: " + sumDiffDiv(10, 20));
        System.out.println("Результат расчета sumMultiplyDiffDiv: " + sumMultiplyDiffDiv(10, 20));
    }
}
