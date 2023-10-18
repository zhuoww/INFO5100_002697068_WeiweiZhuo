package Exercises.exercise1;

import java.util.*;

public class Student {
    String name;
    ArrayList<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>(15);
    }

    public void addQuizScore(int score) {
        quizScores.add(score);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getQuizScores() {
        return quizScores;
    }

    public double averageQuizScores() {
        if (quizScores.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int quizScore : quizScores) {
            sum += quizScore;
        }

        return (double) sum / quizScores.size();
    }

    public void printName() {
        System.out.println("Student: " + name);
    }

}

