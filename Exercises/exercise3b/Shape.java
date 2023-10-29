package Exercises.exercise3b;
import java.io.Serializable;

public abstract class Shape implements java.io.Serializable {
    public String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public static String getClassName() {
        return "Shape";
    }
}
