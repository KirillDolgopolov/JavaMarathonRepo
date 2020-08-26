package Day3;
/*Реализовать программу, которая в консоль выводит название страны,
принимая на вход название города.
Программа должна работать до тех пор, пока не будет введено слово “Stop”.
Реализовать, используя следующие данные:
Москва, Владивосток, Ростов - Россия. Рим, Милан, Турин - Италия.
При вводе любого другого города вывести сообщение “Неизвестная страна”.
*/


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Справочник городов. \nВведите название города, " +
                "и получите страну нахождения. " +
                "\nДля остановки наберите Stop");
        Scanner in = new Scanner(System.in);
        String stop = "Stop";

        for (; ; ) {
            String city = in.nextLine();
            switch (city) {
                case "Stop":
                    break;
                default:
                    System.out.println("Вы ввели некорректное значение");
                    break;
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Это Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Это Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Это Англия");
                    break;
                case "Кёльн":
                case "Берлин":
                case "Мюнхен":
                    System.out.println("Это Германия");
                    break;
            }
            if (city.equals(stop)) {
                break;
            }
        }
    }
}



