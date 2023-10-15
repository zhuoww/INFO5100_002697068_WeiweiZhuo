package Exercises.exercise0;

public class Animals {
    private String species;
    private String habitat;
    private String color;
    private double weight;
    private int lifeSpan;
    private int numberOfLegs;
    private boolean canFly;
    private boolean isDangerous;

    public Animals(String species) {
        this.species = species;
        System.out.println("Animal: " + species + " is created");
    }

    public void eat() {

    }

    public void sleep() {

    }

    public void run() {

    }

    class Dog {
        private String name;
        private String breed;
        private int age;
        private boolean isFriendly;
        private String color;
        private String Owner;
        private int IQ;
        private String birthday;

        public Dog(String name) {
            this.name = name;
            System.out.println("Dog: " + name + " is created");
        }

        public void barking() {

        }

        public void waggingTail() {

        }

        public void hungry() {

        }
    }

    class Fish {
        private String name;
        private String species;
        private String region;
        private String waterType;
        private int lifeSpan;
        private double length;
        private double speed;
        private boolean isDangerous;

        public Fish(String name) {
            this.name = name;
            System.out.println("Fish: " + name + " is created");
        }

        public void swimming() {

        }

        public double getSpeed() {
            System.out.println("The speed is : " + speed);
            return speed;
        }

        public void prey() {

        }
    }

    public static void main(String[] args) {
        Animals animal1 = new Animals("Bird");
        Animals animal2 = new Animals("Dog");
        Animals animal3 = new Animals("Fish");

        Dog dog1 = animal2.new Dog("Happy");
        Dog dog2 = animal2.new Dog("Foodie");
        Dog dog3 = animal2.new Dog("Coco");

        Fish fish1 = animal3.new Fish("Speed");
        Fish fish2 = animal3.new Fish("Blue");
        Fish fish3 = animal3.new Fish("Lazy");

    }

}

