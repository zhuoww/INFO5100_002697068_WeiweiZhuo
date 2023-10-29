package Exercises.exercise3b;
import java.io.Serializable;

public class Square extends Shape implements java.io.Serializable {
    public double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public static String getClassName() {
        return "Square";
    }
}
