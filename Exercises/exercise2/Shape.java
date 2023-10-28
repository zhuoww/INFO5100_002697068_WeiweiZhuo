package Exercises.exercise2;

public abstract class Shape {
    private String color;

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
