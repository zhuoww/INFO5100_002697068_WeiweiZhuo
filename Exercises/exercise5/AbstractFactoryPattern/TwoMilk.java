package Exercises.exercise5.AbstractFactoryPattern;

public class TwoMilk implements Milk{
    @Override
    public void froth() {
        System.out.println("Frothing two milk for Cappuccino");
    }
}
