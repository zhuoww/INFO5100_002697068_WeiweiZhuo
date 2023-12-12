package Exercises.exercise5.FacadePattern;

public class FacadePattern {
    public static void main(String[] args) {
        DishMaker dishMaker = new DishMaker();
        dishMaker.cookFish();
        dishMaker.cookShrimp();
        dishMaker.cookSteak();
    }

}
