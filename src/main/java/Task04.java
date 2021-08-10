import java.util.Random;

/**
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Ищем максимальный отрицательный и минимальный положительный элементы массива. Меняем их местами.
 */

public class Task04 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] mas = new int[20];
        int max = 10;
        int min = -10;
        int MinPosMass = 1;
        int MaxNegMass = -11;

        /* Ищем максимальный отрицательный и минимальный положительный элемент */
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * ((max - min) + 1)) + min;
            if (mas[i] < 0 && mas[i] > MaxNegMass) {
                MaxNegMass = mas[i];
            } else if (mas[i] > 0 && mas[i] < MinPosMass) {
                MinPosMass = mas[i];
            }
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("Максимальный отрицательный элемент = " + MaxNegMass);
        System.out.println("Минимальный положительный элемент = " + MinPosMass);

        /* Меняем максимальный отрицательный и минимальный положительный элемент массива местами */
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == MaxNegMass) {
                mas[i] = MinPosMass;
            } else if (mas[i] == MinPosMass) {
                mas[i] = MaxNegMass;
            }
            System.out.print(mas[i] + " ");
        }
    }
}