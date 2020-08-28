package Day5;


import java.util.Scanner;

/*1. Создать класс Автомобиль,
с полями “Год выпуска”, “Цвет”, “Модель”.
Создать геттеры и сеттеры для каждого поля.
Создать экземпляр класса Автомобиль,
задать сеттером каждое поле,
вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.
*/
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Создаём автомобиль");
        Autocar car = new Autocar();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите год выпуска");
        int inputYear = input.nextInt();
        input.nextLine();//очищаем сканнер
        car.setYear(inputYear);
        System.out.println("Введите цвет");
        String inputColor = input.nextLine();
        car.setColor(inputColor);
        System.out.println("Введите модель");
        String inputModel = input.nextLine();
        car.setModel(inputModel);

        System.out.println("У нас получился автомобиль:");
        System.out.println("Модель :" + car.getModel());
        System.out.println("Цвет :" + car.getColor());
        System.out.println("Год выпуска: " + car.getYear());

    }
}


class Autocar {
    private int year;
    private String color;
    private String model;

    public void setYear(int yearOfCar) {
        if (yearOfCar >= 2020 || yearOfCar < 1672) {
            System.out.println("За пределами истории");
            year = 2020;
        } else {
            year = yearOfCar;
        }
    }

    public int getYear() {
        return year;
    }

    public void setColor(String colorOfCar) {
        if (colorOfCar.isEmpty()) {
            System.out.println("Ты ввёл пустое поле");
            color = "Бесцветный";
        } else {
            color = colorOfCar;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String modelOfCar) {
        if (modelOfCar.isEmpty()) {
            System.out.println("Ты ввёл пустое поле");
            model = "Самодельный";
        } else {
            model = modelOfCar;
        }
    }

    public String getModel() {
        return model;
    }
}