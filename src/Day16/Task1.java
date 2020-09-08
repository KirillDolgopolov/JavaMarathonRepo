package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File fileIn = new File("Test");
        try {
            Scanner scanner = new Scanner(fileIn);
            int counter = 0;
            float result = 0f;
            String[] array = (scanner.nextLine()).split(" ");
            for (String x : array) {
                result += Float.parseFloat(array[counter++]);
            }
            result /= counter;
            System.out.printf("%f ----> %.3f", result, result);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
