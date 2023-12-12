package Exercises.exercise5.FacadePattern;

public class DishMaker {
    private Dish fish;
    private Dish shrimp;
    private Dish steak;

    public DishMaker() {
        fish = new Fish();
        shrimp = new Shrimp();
        steak = new Steak();
    }

    public void cookFish() {
        fish.cook();
    }

    public void cookShrimp() {
        shrimp.cook();
    }

    public void cookSteak() {
        steak.cook();
    }
}
