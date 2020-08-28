package Day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int s = 0; s < array[i].length; s++) {
                array[i][s] = (int) (Math.random() * 51);
            }//Создал матрицу исходных данных
        }
        int sum = 0;
        int[] sumAr = new int[array.length];
        for (int line = 0; line < array.length; line++) {
            for (int colm = 0; colm < array[line].length; colm++) {
                sumAr[line] = sum + array[line][colm];
            }
        }//Создал массив длинной [количество строк матрицы], и заполнил его суммами строк

        int sumMax = 0;
        for (int x : sumAr) {
            if (x > sumMax) {
                sumMax = x;
            }

        }//Вычислил максимальную сумму 2 5 4 9 8 0 6 9 1

        int numLine = 0;
        for (int x = 0; x < sumAr.length; x++) {
            if (sumAr[x] == sumMax) {
                numLine = x;
            }
        }//Вычислил номер строки
        System.out.println("Номер строки: " + (numLine + 1));
    }
}