package Exercises.exercise5.AbstractFactoryPattern;

public class MilkFactory extends AbstractFactory{
    public Coffee createCoffee(String coffeeType) {
        return null;
    }

    public Milk createMilk(String milkType) {
        if (milkType == null) {
            return null;
        }

        if (milkType.equalsIgnoreCase("NOMILK")) {
            return new NoMilk();
        }else if (milkType.equalsIgnoreCase("ONEMILK")) {
            return new OneMilk();
        }else if (milkType.equalsIgnoreCase("TWOMILK")) {
            return new TwoMilk();
        }

        return null;
    }
}
