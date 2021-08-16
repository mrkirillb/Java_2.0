/**
 * Описываем считывание значений с консоли
 */

package oopCalc;

import java.util.Scanner;

public class Reader {
    public double Nums() {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double n = 0;
        n = scanner.nextDouble();
        return n;
    }
}
