package Day6;
/*
Создать класс "Преподаватель",
имеющий поля “ФИО”, “Предмет”.
Создать класс "Студент" с полем “ФИО”.
Каждый класс имеет конструктор (с параметрами),
все set и get методы,
а также у преподавателя есть метод "оценить студента"
принимающий в параметры студента,
и работающий следующим образом:
генерируется случайное число от 2 до 5,
выводится строка:
"Преподаватель ИМЯПРЕПОДАВАТЕЛЯ
оценил студента с именем ИМЯСТУДЕНТА
по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами,
должны быть заменены соответствующими значениями.
ОЦЕНКА должна принимать значения "отлично”, "хорошо”,
"удовлетворительно" или "неудовлетворительно",
в зависимости от значения случайного числа.
Создайте по 1 экземпляру каждого класса,
у преподавателя вызовите метод оценки студента,
передав студента в качестве аргумента метода.
 */

public class Task3 {
    public static void main(String[] args) {

        Student myStudent = new Student("Сидоров Иван Петрович");

        Professor myProfessor = new Professor("Шнитке Генрих Эдуардович",
                "Теория вселенной");

        myProfessor.rateStudent(myStudent);

    }
}

class Professor {
    private String name;
    private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    String getSubject() {
        return this.subject;
    }

    void rateStudent(Student s) {
        int rate = (int) (Math.random() * (5 - 2 + 1)) + 2;
        String rateWord = "";
        switch (rate) {
            case 2:
                rateWord = "Неудовлетворительно";
                break;
            case 3:
                rateWord = "Удовлетворительно";
                break;
            case 4:
                rateWord = "Хорошо";
                break;
            case 5:
                rateWord = "Отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем "
                + s.getName() + " по предмету " + subject + " на оценку " + rateWord);


    }
}


class Student {
    private String name;

    public Student(String name) { this.name = name; }

    public void setName(String name) { this.name = name; }

    String getName() { return this.name; }
}