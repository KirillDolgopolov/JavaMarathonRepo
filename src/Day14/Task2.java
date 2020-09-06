package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    static List<String> parseFileToStringList(Scanner s) {
        List<String> myString = new ArrayList<>();
        while (s.hasNextLine()) {
            myString.add(s.nextLine());
        }
        return myString;
    }

    public static void main(String[] args) {
        File file = new File("people");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        List<String> people = parseFileToStringList(scanner);

        System.out.println(people);
        //как из этого листа вытащить возраст, который там тоже Стринг не понял, к сожалению.
        //в Интернете в примерах одни цифры в строчку - так просплитить я их и сам могу


    }
}
