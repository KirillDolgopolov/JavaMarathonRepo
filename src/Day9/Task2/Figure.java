package Day9.Task2;

public abstract class Figure {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public abstract double area();

    public abstract double perimeter();

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

}
