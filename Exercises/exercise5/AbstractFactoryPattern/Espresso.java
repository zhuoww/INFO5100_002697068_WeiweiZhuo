package Exercises.exercise5.AbstractFactoryPattern;

public class Espresso implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing Espresso");
    }
}
