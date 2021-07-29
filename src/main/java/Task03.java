import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите необходимую функцию: 1 = Выполнение калькулятора, 2 = Поиск максимального слова в массиве");
        int choise = scanner.nextInt();
        if (choise == 1) {
            calculate(); // вызываем калькулятор
        }
        else if (choise ==2){
            maxM(); // поиск максимального слова в массиве
        }
        else {
            System.err.println("Ошибка");
        }
    }
    //метод калькулятор дробных чисел
    public static void calculate() {
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
    //метод поиск самого длинного слова
    public static void maxM(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = scanner.nextInt();
        String[] mas = new String[n];
        int maxElement = 0;
        String maxslovo = null;
        for (int i =0; i < mas.length; i++){
            System.out.println("Введите " + (i+1) + " слово");
            mas[i] = scanner.next();
            if (maxElement < mas[i].length()) {
                maxElement = mas[i].length();
                maxslovo = mas[i];
            }
        }
        System.out.println("Самое длинное слово: " + maxslovo);
    }
}