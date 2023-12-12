package Exercises.exercise5.AbstractFactoryPattern;

public class Latte implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing Latte");
    }
}
