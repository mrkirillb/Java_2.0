/**
 * @author Budaev Kirill
 * @param num1 entering the first number
 * @param num2 entering the second number
 */

import java.util.Scanner;
public class Task2 {
    //пишем простой калькулятор дробных чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float num1;
        Float num2;
        int f;
        System.out.print("Введите первое число: ");
        num1 = scanner.nextFloat();
        System.out.print("Введите второе число: ");
        num2 = scanner.nextFloat();
        System.out.print("Выберите необходимую операции " + "(1 = вычитание, 2 = сложение, 3 = умножение, 4 = деление): ");
        f = scanner.nextInt();
        float result;
        switch (f){
            case 1:
                result = num1 - num2;
                System.out.printf("Разность = %.4f", result );
                break;
            case 2:
                result = num1 + num2;
                System.out.printf("Сумма = %.4f", result );
                break;
            case 3:
                result = num1 * num2;
                System.out.printf("Произведение = %.4f", result );
                break;
            case 4:
                result = num1 / num2;
                System.out.printf("Частное = %.4f", result );
                break;
            default:

                System.err.println("Ошибка. Выберите один из 4 заданных вариантов операций.");
        }
    }
}