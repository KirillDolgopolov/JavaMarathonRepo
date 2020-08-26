package Day3;

import java.util.Scanner;

/*
Реализовать программу, которая 5 раз запрашивает от пользователя два числа
- делимое и делитель. Для этих двух чисел
программа рассчитывает результат деления и
выводит его в консоль. Если пользователь вводит 0 в качестве делителя,
вместо того, чтобы останавливать работу цикла принудительно,
мы пропускаем итерацию и выводим в консоль сообщение “Деление на 0”.
Ключевое слово else использовать в этой программе нельзя.
 */
public class Task3 {
    public static void main(String[] args) {
        double numerator;
        double denumerator;
        double result;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Попытка номер " + (i + 1) + " из 5");
            System.out.println("Введите числитель");
            numerator = in.nextDouble();
            System.out.println("Введите знаменатель");
            denumerator = in.nextDouble();
            for (; denumerator == 0; ) {
                System.out.println("Деление на ноль");
                break;
            }
            for (; denumerator != 0; ) {
                System.out.println("Результат " + numerator / denumerator);
                break;
            }
        }
    }
}
