package Exercises.exercise5.ObserverPattern;

public class ObserverPattern {
    public static void main(String[] args) {
        InstagramUser user1 = new InstagramUser();

        Followers f1 = new Followers("Vivi");
        Followers f2 = new Followers("Yun");
        Followers f3 = new Followers("Gu");
        Followers f4 = new Followers("Felicia");

        user1.follow(f1);
        user1.follow(f2);
        user1.follow(f3);
        user1.follow(f4);

        user1.unFollow(f3);

        f1.followInstagramUser(user1);
        f2.followInstagramUser(user1);
        f3.followInstagramUser(user1);
        f4.followInstagramUser(user1);

        user1.post("Traveling to LA");
        System.out.println("--------------------------------------------------------");
        user1.post("Running Today");




    }
}
