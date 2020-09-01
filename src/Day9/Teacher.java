package Day9;

public class Teacher extends Human {
    private String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    String getSubject() {
        return subject;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Это преподаватель с именем " + getName());
    }
}
