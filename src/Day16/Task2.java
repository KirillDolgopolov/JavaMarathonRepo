package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File fileIn = new File("file1");
        File fileOut = new File("file2");

        PrintWriter pw = new PrintWriter(fileIn);
        for (int i = 0; i < 1000; i++) {
            int x = (int) (Math.random() * 101);
            pw.println(x);
        }
        pw.close();

        Scanner scanner = new Scanner(fileIn);
        PrintWriter pw2 = new PrintWriter(fileOut);
        int counter = 0;
        double sum20 = 0.d;
        while (scanner.hasNextLine()) {
            counter++;
            sum20 += Integer.parseInt(scanner.nextLine());

            if (counter == 20) {
                pw2.println(sum20 / counter);
                counter = 0;
                sum20 = 0d;
            }
        }
        scanner.close();
        pw2.close();

        double sum = 0d;
        Scanner scan2 = new Scanner(fileOut);
        while (scan2.hasNextLine()) {
            sum += Double.parseDouble(scan2.nextLine());
        }
        scan2.close();
        System.out.println((int) sum);
    }
}

