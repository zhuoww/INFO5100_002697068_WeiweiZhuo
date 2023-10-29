package Exercises.exercise3b;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObjects {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("Green", 3.0, 4.0, 5.0);
        Rectangle rectangle = new Rectangle("purple", 3.0, 5.0);
        Circle circle = new Circle("Grey", 3.5);
        Square square = new Square("Pink", 6.0);

        try {
            FileOutputStream fileOut = new FileOutputStream("shape.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(triangle);
            out.writeObject(rectangle);
            out.writeObject(circle);
            out.writeObject(square);
            out.close();
            fileOut.close();
            System.out.println("Serialized Data is saved in shape.ser");
        }catch (IOException i) {
            i.printStackTrace();
        }

    }
}
