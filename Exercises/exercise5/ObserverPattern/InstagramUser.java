package Exercises.exercise5.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class InstagramUser implements Subject {
    private List<Followers> followers = new ArrayList<>();
    String postContent;

    @Override
    public void follow(Followers follower) {
        followers.add(follower);
    }

    @Override
    public void unFollow(Followers follower) {
        followers.remove(follower);
    }

    @Override
    public void notifyFollowers() {
        for(Followers follower : followers) {
            follower.update();
        }
    }

    @Override
    public void post(String postContent) {
        this.postContent = postContent;
        notifyFollowers();
    }


}
