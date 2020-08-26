package Day3;

import java.util.Scanner;

/*
Реализовать программу, которая пока работает,
принимает на вход от пользователя два числа - делимое и делитель.
Для этих двух чисел программа рассчитывает результат деления и выводит его в консоль.
Программа останавливает свою работу тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать
тип double и метод nextDouble() у Scanner’а соответственно).
 */
public class Task2 {
    public static void main(String[] args) {
        double numerator;
        double denumerator;
        double result;
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите числитель");
            numerator = in.nextDouble();
            System.out.println("Введите знаменатель");
            denumerator = in.nextDouble();
            if (denumerator == 0) {
                System.out.println("Ноль не может быть знаменателем. \nЗавершаем программу");
                break;
            } else {
                result = numerator / denumerator;
                System.out.println("Результат деления = " + result);
            }
        }
    }
}
