package Day18;

public class Task1 {


    public static void main(String[] args) {
        int[] numbers = {123, 42, 23, 12, 543, 9, -43, 234, 235, 654, 34};
        System.out.println(metodSum(numbers, 0));
    }

    public static int metodSum(int[] array, int x) {
        if (x == array.length)
            return 0;
        System.out.println("control: " + array[x]);
        return array[x] + metodSum(array, x + 1);
    }
}
