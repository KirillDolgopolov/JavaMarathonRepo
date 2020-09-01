package Day9.Task2;

public class Triangle extends Figure {
    public double length1;
    public double length2;
    public double length3;

    Triangle(double length1, double length2, double length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
    }

    @Override
    public double perimeter() {
        return length1 + length2 + length3;
    }
}
