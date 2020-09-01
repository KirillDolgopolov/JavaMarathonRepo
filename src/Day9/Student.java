package Day9;

public class Student extends Human {
    private String group;

    public Student(String name, String group) {
        super(name);
        this.group = group;
    }

    void setGroup(String group) {
        this.group = group;
    }

    String getGroup() {
        return group;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Это студент с именем " + getName());
    }
}
