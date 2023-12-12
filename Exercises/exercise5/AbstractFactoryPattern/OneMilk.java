package Exercises.exercise5.AbstractFactoryPattern;

public class OneMilk implements Milk{
    @Override
    public void froth() {
        System.out.println("Frothing one milk for Latte");
    }
}
