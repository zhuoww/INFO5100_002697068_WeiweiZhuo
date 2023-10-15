package Exercises.exercise0;

public class Food {
    private String name;
    private String category;
    private double price;
    private int calories;
    private String ingredients;
    private boolean isVegetarian;
    private String cuisine;
    private boolean isSpicy;

    public Food(String name, String category) {
        this.name = name;
        this.category = category;
        System.out.println("Food: " + name + " is created");
    }

    public void serve() {
        System.out.println("Serving: " + name);
    }

    public void purchase() {
        System.out.println("Purchasing: " + name);
    }

    public int getCalories() {
        System.out.println("Calories: " + calories);
        return calories;
    }

    public static void main(String[] args) {
        Food beef = new Food("Texas Beef", "meat");
        Food chicken = new Food("Fried Chicken", "meat");
        Food apple = new Food("Fuji Apple", "fruit");
    }


}
