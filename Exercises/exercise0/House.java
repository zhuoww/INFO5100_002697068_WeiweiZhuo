package Exercises.exercise0;

public class House {
    private String address;
    private int numberOfRooms;
    private double height;
    private double totalArea;
    private int numberOfFloors;
    private String material;
    private int numberOfBathrooms;
    private boolean hasGarage;

    public House(String address) {
        this.address = address;
        System.out.println("House: " + address + " is created");
    }

    public int getNumberOfRooms() {
        System.out.println("The number of rooms is: " + numberOfRooms);
        return numberOfRooms;
    }

    public void turnOnLights() {
        System.out.println("Lights turned on.");
    }

    public void openDoor() {
        System.out.println("Door opened.");
    }

    public static void main(String[] args) {
        House house1 = new House("96 Diadem Dr.");
        House house2 = new House("56 St.");
        House house3 = new House("445E St.");
    }
}
