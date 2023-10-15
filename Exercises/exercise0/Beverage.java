package Exercises.exercise0;

public class Beverage {
    private String name;
    private String brand;
    private double volumeInLiters;
    private boolean isCarbonated;
    private double price;
    private int calories;
    private String flavor;
    private boolean isCaffeinated;

    public Beverage(String name, String brand, double volumeInLiters) {
        this.name = name;
        this.brand = brand;
        this.volumeInLiters = volumeInLiters;
        System.out.println("Beverage: " + name + " is created");
    }

    public void open() {
        System.out.println("The beverage is Opened.");
    }

    public void drink() {
        System.out.println("Drink" + name);
    }

    public void pour() {
        System.out.println("The beverage is Poured");
    }

    public static void main(String[] args) {
        Beverage cola = new Beverage("Cola", "Coco", 0.5);
        Beverage orangeJuice = new Beverage("Orange Juice", "Simple", 0.8);
        Beverage sprite = new Beverage("Sprite", "SP", 0.5);
    }

}
