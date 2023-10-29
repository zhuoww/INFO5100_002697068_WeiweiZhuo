package Exercises.exercise3b;
import java.io.Serializable;

public class Rectangle extends Shape implements java.io.Serializable {
    public double height;
    public double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    public static String getClassName() {
        return "Rectangle";
    }
}
