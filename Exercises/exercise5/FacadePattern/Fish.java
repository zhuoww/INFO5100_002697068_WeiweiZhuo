package Exercises.exercise5.FacadePattern;

public class Fish implements Dish{
    @Override
    public void cook() {
        System.out.println("Cooking fish");
    }
}
