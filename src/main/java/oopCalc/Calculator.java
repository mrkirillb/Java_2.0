package oopCalc;

import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {

        try {
            Reader reader = new Reader();
            System.out.println("Введите первое число для расчета: ");
            double numberOne = reader.Nums();
            System.out.println("Введите второе число для расчета: ");
            double numberTwo = reader.Nums();

            HeadClass headclass = new HeadClass(numberOne, numberTwo);

            System.out.println("Выберите необходимую операцию для расчета:\n" +
                    "1 - Сложение\n" +
                    "2 - Вычитание\n" +
                    "3 - Умножение\n" +
                    "4 - Деление");

            int operation;
            operation = (int) reader.Nums();

            switch (operation) {
                case (1):
                    System.out.printf("%.4f", headclass.summation());
                    break;
                case (2):
                    System.out.printf("%.4f", headclass.substraction());
                    break;
                case (3):
                    System.out.printf("%.4f", headclass.multiplication());
                    break;
                case (4):
                    System.out.printf("%.4f", headclass.division());
                    break;
                default:
                    System.err.println("Ошибка. Выберите один из 4 заданных вариантов операций.");
            }
            System.out.println("------------------------------------\n");

        } catch (
                ArithmeticException e) {
            System.out.println("Ошибка. На ноль делить нельзя.");
        } catch (
                InputMismatchException e) {
            System.out.println("Ошибка. Введите корректное значение числа для расчета или корректный вариант операции.");
        }
    }
}

