package Exercises.exercise5.AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("COFFEE")) {
            return new CoffeeFactory();
        }else if (choice.equalsIgnoreCase("MILK")) {
            return new MilkFactory();
        }
        return null;
    }
}
