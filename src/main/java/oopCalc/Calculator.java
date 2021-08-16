package oopCalc;

public class Calculator {
    public static void main(String[] args) {

        Reader reader = new Reader();
        System.out.println("Введите первое число для расчета: ");
        double numberOne = reader.readNums();
        System.out.println("Введите второе число для расчета: ");
        double numberTwo = reader.readNums();

        HeadClass headclass = new HeadClass(numberOne, numberTwo);

        System.out.println("Выберите необходимую операцию для расчета:\n" +
                "1 - Сложение\n" +
                "2 - Вычитание\n" +
                "3 - Умножение\n" +
                "4 - Деление");

        int operation;
        operation = (int) reader.readNums();

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
    }
}