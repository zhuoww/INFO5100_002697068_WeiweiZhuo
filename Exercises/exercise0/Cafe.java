package Exercises.exercise0;

public class Cafe {
    private String name;
    private String location;
    private int seatingCapacity;
    private boolean hasWiFi;
    private String openingTime;
    private String closingTime;
    private double profit;
    private int numberOfEmployees;

    public Cafe(String name, String location) {
        this.name = name;
        this.location = location;
        System.out.println("Cafe: " + name + " is created");
    }

    public void open() {
        System.out.println("The Cafe opened.");
    }

    public void close() {
        System.out.println("The Cafe closed.");
    }

    public double getProfit() {
        System.out.println("The total profit is: " + profit);
        return profit;
    }

    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Weiwei Cafe", "San Jose");
        Cafe cafe2 = new Cafe("Peet's Cafe", "Seattle");
        Cafe cafe3 = new Cafe("Starbucks Cafe", "San Francisco");
    }


}
