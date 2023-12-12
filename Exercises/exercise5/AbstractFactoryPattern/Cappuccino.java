package Exercises.exercise5.AbstractFactoryPattern;

public class Cappuccino implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Cappuccino");
    }
}
