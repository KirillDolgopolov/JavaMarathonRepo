package Day4;

import java.util.Arrays;
import java.util.Scanner;
/*С клавиатуры вводится число n - размер массива.
Необходимо создать массив указанного размера
и заполнить его случайными числами от 0 до 10.
Затем вывести содержимое массива в консоль,
а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
*/

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] myNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 11);
            myNumbers[i] = x;
        }
        System.out.println("Содержание массива: " + Arrays.toString(myNumbers));

        int upEight = 0;
        int itsOne = 0;
        int evens = 0;
        int sum = 0;
        for (int x : myNumbers) {
            if (x > 8) {
                upEight++;
            }
            if (x == 1) {
                itsOne++;
            }
            if (x % 2 == 0) {
                evens++;
            }
            sum = sum + x;
        }
        System.out.println("Чисел больше 8 в массиве: " + upEight);
        System.out.println("Чисел равных 1 в массиве: " + itsOne);
        System.out.println("Количество чётных чисел в массиве: " + evens);
        System.out.println("Количество нечётных чисел в массиве: " + (n - evens));
        System.out.println("Сумма всех элементов в массиве: " + sum);
    }
}

