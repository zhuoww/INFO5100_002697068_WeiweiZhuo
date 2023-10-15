package Exercises.exercise0;

public class Job {
    private String jobTitle;
    private String company;
    private double salary;
    private String location;
    private int experienceRequired;
    private boolean isFullTime;
    private String jobDescription;
    private String applicationDeadline;

    public Job(String jobTitle, String company, double salary, String location) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
        this.location = location;
        System.out.println("Job: " + jobTitle + " at " + company + " is created");
    }

    public void apply() {
        System.out.println("The job has been applied.");
    }

    public void interview() {
        System.out.println("I am interviewing now.");
    }

    public void offer() {
        System.out.println("I got the offer.");
    }

    public static void main(String[] args) {
        Job job1 = new Job("SDE", "Google", 250000, "Mountain View");
        Job job2 = new Job("SDE Intern", "Adobe", 200000, "San Jose");
        Job job3 = new Job("SWE", "Apple", 300000, "Cupertino");
    }



}
