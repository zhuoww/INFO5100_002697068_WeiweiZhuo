package Exercises.exercise0;

public class Car {
    private String brand;
    private double topSpeed;
    private int year;
    private String model;
    private boolean isElectric;
    private String fuelType;
    private int capacity;
    private String color;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Car: " + model + " is created");
    }

    public void drive() {
        System.out.println("Driving");
    }

    public void startEngine() {
        System.out.println("Engine is starting.");
    }

    public void brake() {
        System.out.println("Braking");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Ford", "Mustang");
        Car car3 = new Car("BMW", "X5");
    }
}
