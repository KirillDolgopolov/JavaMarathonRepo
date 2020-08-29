package Day6;

class Autocar {
    private int year;
    private String color;
    private String model;

    void sayHello(){
        System.out.println("Это Автомобиль");
    }//Метод вывода...вот этого вот))

    int difOfYears(int n){
        int dif=n-year;
        return dif;
    }//Метод разницы в годах

    public void setYear(int yearOfCar) {
        if (yearOfCar >= 2020 || yearOfCar < 1672) {
            System.out.println("За пределами истории");
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