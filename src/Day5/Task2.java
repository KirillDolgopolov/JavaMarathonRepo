package Day5;

import java.util.Scanner;

/*
Создать класс Мотоцикл, с  полями
“Год выпуска”, “Цвет”, “Модель”.
Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не использовать).
Придерживаться принципов инкапсуляции и использовать ключевое слово this.
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.println("Создаём мотоцикл конструктором");
        Scanner input = new Scanner(System.in);
        System.out.println("Введите год выпуска");
        int inputYear = input.nextInt();
        input.nextLine();//очищаем сканнер
        System.out.println("Введите цвет");
        String inputColor = input.nextLine();
        System.out.println("Введите модель");
        String inputModel = input.nextLine();

        Motorbike myBike = new Motorbike(inputYear, inputColor, inputModel);
        myBike.getInfo();
    }

    static class Motorbike {

        private int year;
        private String color;
        private String model;

        public Motorbike(int year, String color, String model) {
            this.year = year;
            this.color = color;
            this.model = model;
        }

        public void getInfo() {
            System.out.println("Создан мотоцикл модели " + model);
            System.out.println("Цвет мотоцикла: " + color);
            System.out.println("Год выпуска: " + year);
        }
    }
}
