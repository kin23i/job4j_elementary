package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x2MinusX1 = x2 - x1;
        int y2MinusY1 = y2 - y1;
        double x2MinusX1Pow2 = Math.pow(x2MinusX1, 2);
        double y2MinusY1Pow2 = Math.pow(y2MinusY1, 2);
        double plusPow2 = x2MinusX1Pow2 + y2MinusY1Pow2;
        double rsl = Math.sqrt(plusPow2);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
