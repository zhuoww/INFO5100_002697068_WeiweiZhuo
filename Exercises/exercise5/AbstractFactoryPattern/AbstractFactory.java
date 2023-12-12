package Exercises.exercise5.AbstractFactoryPattern;

public abstract class AbstractFactory {
    abstract Coffee createCoffee(String coffeeType);
    abstract Milk createMilk(String milkType);
}
