package Day9.Task2;

public class Circle extends Figure {
    public double radius;

    Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
}
