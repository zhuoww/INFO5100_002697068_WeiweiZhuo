package Exercises.exercise3b;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeObjects {
    public static void main(String[] args) {
        Triangle readTriangle = null;
        Rectangle readRectangle = null;
        Circle readCircle = null;
        Square readSquare = null;

        try {
            FileInputStream fileIn = new FileInputStream("shape.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            readTriangle = (Triangle) in.readObject();
            readRectangle = (Rectangle) in.readObject();
            readCircle = (Circle) in.readObject();
            readSquare = (Square) in.readObject();

            in.close();
            fileIn.close();

        }catch (IOException i){
            i.printStackTrace();
            return;
        }catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            e.printStackTrace();
            return;
        }

        System.out.println("-------------------Deserialized Triangle-------------------");
        System.out.println("Color: " + readTriangle.color);
        System.out.println("SideA: " + readTriangle.sideA);
        System.out.println("SideB: " + readTriangle.sideB);
        System.out.println("SideC: " + readTriangle.sideC);
        System.out.println("-------------------Deserialized Rectangle-------------------");
        System.out.println("Color: " + readRectangle.color);
        System.out.println("Height: " + readRectangle.height);
        System.out.println("Width: " + readRectangle.width);
        System.out.println("---------------------Deserialized Circle--------------------");
        System.out.println("Color: " + readCircle.color);
        System.out.println("Radius: " + readCircle.radius);
        System.out.println("--------------------Deserialized Square---------------------");
        System.out.println("Color: " + readSquare.color);
        System.out.println("Side: " + readSquare.side);

    }
}
