package Exercises.exercise5.ObserverPattern;

public class Followers implements Observer {
    private String followerName;
    private InstagramUser instagramUSer = new InstagramUser();

    public Followers(String followerName) {
        this.followerName = followerName;
    }
    @Override
    public void update() {
        System.out.println("Hi " + followerName + ", This is my latest post: " + instagramUSer.postContent);
    }

    @Override
    public void followInstagramUser(InstagramUser iu) {
        instagramUSer = iu;
    }


}
