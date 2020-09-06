package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {


        File file = new File("Test");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        if (numbers.length != 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Некорректный входной файл");
            }//Программа выводит сообщение, но продолжает работу, считает сумму. Почему?!
        }

        int[] numPrim = new int[numbers.length];
        int i = 0;
        for (String number : numbers) {
            numPrim[i++] = Integer.parseInt(number);
        }

        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numPrim[j];
        }
        System.out.println("Сумма всех чисел в файле: " + sum);

    }
}
