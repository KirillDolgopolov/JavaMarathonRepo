package Day4;

public class Task33 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int s = 0; s < array[i].length; s++) {
                array[i][s] = (int) (Math.random() * 51);
            }//Создал матрицу исходных данных
        }
        int sum = 0;
        int sumMax = 0;
        int index=0;

        for (int x=0; x< array.length; x++){
            for (int y = 0; y<array[x].length;y++){
                sum=sum+array[x][y];
                if (sum>sumMax){
                    sumMax=sum;
                    index=x;
                }
            }
        }
        System.out.println(sumMax);
        System.out.println(index);

    }
}
