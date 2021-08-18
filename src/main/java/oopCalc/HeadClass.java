/**
 * Основная логика программы
 */

package oopCalc;

public class HeadClass {

    private double x;
    private double y;

    public HeadClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double summation() {
        return x + y;
    }

    public double substraction() {
        return x - y;
    }

    public double multiplication() {
        return x * y;
    }

    public double division() {
        if (y == 0) {
            throw new ArithmeticException();
        } else {
            return x / y;
        }
    }
}