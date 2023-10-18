package Exercises.exercise1;

import java.util.*;
public class Session {
    ArrayList<Student> students;

    public Session(ArrayList<Student> students) {
        this.students = students;
    }

    public double averageQuizScoresForWholeClass() {
        double totalAverage = 0;
        for (Student student : students) {
            totalAverage += student.averageQuizScores();
        }

        return totalAverage / students.size();
    }

    public void printAscendingQuizScores() {
        List<Integer> allQuizScores = new ArrayList<>();
        for (Student student : students) {
            allQuizScores.addAll(student.quizScores);
        }
        Collections.sort(allQuizScores);
        System.out.println(allQuizScores);
    }

    public void printPartTimeStudentNames() {
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println("Part-Time Student Name: " + student.getName());
            }
        }
    }

    public void printFullTimeStudentExamScores() {
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println(fullTimeStudent.getName() + " Exam Scores : " + fullTimeStudent.getExamScore1() + " , " + fullTimeStudent.getExamScore2());
            }
        }
    }
}
