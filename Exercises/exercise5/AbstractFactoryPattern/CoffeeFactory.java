package Exercises.exercise5.AbstractFactoryPattern;

public class CoffeeFactory extends AbstractFactory {
    public Coffee createCoffee(String coffeeType) {
        if (coffeeType == null) {
            return null;
        }

        if (coffeeType.equalsIgnoreCase("ESPRESSO")) {
            return new Espresso();
        }else if (coffeeType.equalsIgnoreCase("LATTE")) {
            return new Latte();
        }else if (coffeeType.equalsIgnoreCase("CAPPUCCINO")) {
            return new Cappuccino();
        }

        return null;
    }

    public Milk createMilk(String milkType) {
        return null;
    }
}
