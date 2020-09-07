package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GodOfShoes {
    public static void main(String[] args) {

        File fileIn = new File("shoes.csv");
        Scanner scanner;

        {
            try {
                scanner = new Scanner(fileIn);
                List<String> listOfShoes = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] shArr = line.split(";");
                    if (Integer.parseInt(shArr[2]) == 0) {
                        listOfShoes.add(shArr[0]+", "+shArr[1]+", "+shArr[2]);
                    }

                }
                System.out.println(listOfShoes);
                File fileOut = new File("ShoesNull");
                PrintWriter pw = new PrintWriter(fileOut);
                int i = 0;
                for (String number : listOfShoes) {
                    pw.println(listOfShoes.get(i++));
                }
                pw.close();


            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }


    }
}

