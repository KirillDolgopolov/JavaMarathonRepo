package Day4;

/*
Создать новый массив размера 100 и заполнить его
случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            int x = (int) (Math.random() * 10001);
            array[i] = x;
        }
        int max = 0;
        int min = 10000;
        int finTen = 0;
        int sum = 0;
        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                finTen++;
                sum = sum + x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов,\nоканчивающихся на ноль: " + finTen);
        System.out.println("Сумма этих элементов: " + sum);
    }
}
