package Exercises.exercise3b;
import java.io.Serializable;

public class Circle extends Shape implements java.io.Serializable {
    public double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static String getClassName() {
        return "Circle";
    }

}
