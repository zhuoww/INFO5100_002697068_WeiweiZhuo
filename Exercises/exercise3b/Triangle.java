package Exercises.exercise3b;
import Exercises.exercise3b.Shape;

import java.io.Serializable;

public class Triangle extends Shape implements java.io.Serializable {
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public static String getClassName() {
        return "Triangle";
    }
}
