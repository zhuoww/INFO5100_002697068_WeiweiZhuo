package Exercises.exercise5.AbstractFactoryPattern;

public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory coffeeFactory = FactoryProducer.getFactory("COFFEE");
        Coffee espresso = coffeeFactory.createCoffee("ESPRESSO");
        espresso.brew();

        Coffee latte = coffeeFactory.createCoffee("LATTE");
        latte.brew();

        Coffee cappuccino = coffeeFactory.createCoffee("CAPPUCCINO");
        cappuccino.brew();

        AbstractFactory milkFactory = FactoryProducer.getFactory("MILK");
        Milk noMilk = milkFactory.createMilk("NOMILK");
        noMilk.froth();

        Milk oneMilk = milkFactory.createMilk("ONEMILK");
        oneMilk.froth();

        Milk twoMilk = milkFactory.createMilk("TWOMILK");
        twoMilk.froth();

    }
}
