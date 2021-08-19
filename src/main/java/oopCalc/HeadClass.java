/**
 * Основная логика программы
 */

package oopCalc;

public class HeadClass {

    public HeadClass(double x, double y) {
        HeadClass.x = x;
        HeadClass.y = y;
    }

    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        HeadClass.x = x;
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        HeadClass.y = y;
    }

    private static double x;
    private static double y;

    public double summation() {
        return x + y;
    }

    public double substraction() {
        return x - y;
    }

    public double multiplication() {
        return x * y;
    }

    public static double division() {
        if (y == 0) {
            throw new ArithmeticException();
        } else {
            return x / y;
        }
    }
}