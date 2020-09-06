package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static List<Person> parseFileToObjList(Scanner s) {
        List<String> strings = new ArrayList<>();
        int i = 0;
        List<Person> myPersons = new ArrayList<>();

        while (s.hasNextLine()) {
            strings.add(s.nextLine());
        }

        for (String x : strings) {

        }

        return myPersons;

        //всё. не понимаю больше, что я делаю
    }


    public static void main(String[] args) {
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }


    }
}
