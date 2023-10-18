package Exercises.exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                int exam1 = random.nextInt(101);
                int exam2 = random.nextInt(101);
                FullTimeStudent fullTimeStudent = new FullTimeStudent("FullTimeStudent" + i, exam1, exam2);
                students.add(fullTimeStudent);
            } else {
                PartTimeStudent partTimeStudent = new PartTimeStudent("PartTimeStudent" + i);
                students.add(partTimeStudent);
            }

            for (int j = 0; j < 15; j++) {
                int quiz = random.nextInt(101);
                students.get(i).addQuizScore(quiz);
            }
        }

        Session session = new Session(students);

        System.out.println("------------------------------------------------------------");
        System.out.println("Average Quiz Scores for the whole class: " + session.averageQuizScoresForWholeClass());

        System.out.println("------------------------------------------------------------");
        System.out.println("Quiz Scores in ascending order: ");
        session.printAscendingQuizScores();

        System.out.println("------------------------------------------------------------");
        System.out.println("Names of Part-Time Students:");
        session.printPartTimeStudentNames();

        System.out.println("------------------------------------------------------------");
        System.out.println("Exam Scores of Full-Time Students:");
        session.printFullTimeStudentExamScores();

    }
}
