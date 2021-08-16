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
        return x / y;
    }
}