package Day9;

public class Task1 {
    public static void main(String[] args) {


        Student umnik = new Student("Vasya", "Javistes");
        Teacher prepod = new Teacher("MarIvanna", "Maths");

        System.out.println(umnik.getGroup());
        System.out.println(prepod.getSubject());

        umnik.printInfo();
        prepod.printInfo();

    }
}
