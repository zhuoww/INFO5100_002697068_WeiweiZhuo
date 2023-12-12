package Exercises.exercise5.ObserverPattern;

public interface Subject {
    void follow(Followers follower);

    void unFollow(Followers follower);

    void notifyFollowers();

    void post(String postContent);
}
