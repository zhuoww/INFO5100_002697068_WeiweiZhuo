package Exercises.exercise0;

public class Clothes {
    private String brand;
    private String type;
    private String size;
    private String color;
    private double price;
    private boolean isAvailable;
    private String material;
    private String gender;

    public Clothes(String brand, String type, String size) {
        this.brand = brand;
        this.type = type;
        this.size = size;
        System.out.println("Clothes: " + brand + " is created");
    }

    public void wear() {
        System.out.println("Wearing: " + brand);
    }

    public void selling() {
        System.out.println("Selling: " + brand);
    }

    public void purchase() {
        System.out.println("Purchased: " + brand);
    }

    public static void main(String[] args) {
        Clothes TShirt = new Clothes("Banana Republic", "T-shirt", "XS");
        Clothes jeans = new Clothes("Levis", "Jeans", "M");
        Clothes dress = new Clothes("Gap", "Dress", "L");
    }




}
