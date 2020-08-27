package Day4;

/*Создать новый массив размера 100
и заполнить его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов.
Для найденной тройки с максимальной суммой
выведите значение суммы и индекс первого элемента тройки.
*/
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10001);
        }

        int sum = 0;
        int sumMax = 0;
        int index = 0;
        for (int x = 0; x < array.length - 3; x++) {
            sum = array[x] + array[x + 1] + array[x + 2];
            if (sum > sumMax) {
                sumMax = sum;
                index = x;
            }
        }
        System.out.println(sumMax);
        System.out.println(index);

    }
}
