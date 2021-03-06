package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
                File fileOut = new File("ShoesNull");
                PrintWriter pw = new PrintWriter(fileOut);
                int i = 0;
                while (scanner.hasNextLine()) {
                    String[] shArr = (scanner.nextLine()).split(";");
                    if (Integer.parseInt(shArr[2]) == 0) {
                        listOfShoes.add(shArr[0]+", "+shArr[1]+", "+shArr[2]);
                        pw.println(listOfShoes.get(i++));
                    }
                }
                pw.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
    }
}

