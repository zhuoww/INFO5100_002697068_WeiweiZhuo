package Exercises.exercise0;

public class School {
    private String name;
    private String type;
    private String address;
    private int yearFounded;
    private double totalArea;
    private int numberOfStudents;
    private int numberOfStaffs;
    private int numberOfBuildings;

    public School(String name, String address, int yearFounded) {
        this.name = name;
        this.address = address;
        this.yearFounded = yearFounded;
        System.out.println("School: " + name + " is created");
    }

    public int getNumberOfStudents() {
        System.out.println("The Number of Students is : " + numberOfStudents);
        return numberOfStudents;
    }

    public int getNumberOfStaffs() {
        System.out.println("The Number of Staffs is : " + numberOfStaffs);
        return numberOfStaffs;
    }

    public String getType() {
        System.out.println("The Type of School is : " + type);
        return type;
    }

    class ClassRoom {
        private String classroomName;
        private int buildingNumber;
        private int floorNumber;
        private int capacity;
        private int numberOfSeats;
        private boolean isOccupied;
        private boolean hasSprinkler;
        private boolean hasAirConditioner;

        public ClassRoom(String classroomName) {
            this.classroomName = classroomName;
            System.out.println("ClassRoom: " + classroomName + " is created");
        }

        public void startClass() {
            System.out.println("The Class is starting");
        }

        public void endClass() {
            System.out.println("The Class is end");
        }

        public int getCapacity() {
            System.out.println("The Capacity of the classroom is : " + capacity);
            return capacity;
        }
    }

    class Student {
        private String studentName;
        private String studentID;
        private int age;
        private String gender;
        private String grade;
        private String major;
        private String degree;
        private boolean isEnrolled;

        public Student(String studentName, String studentID) {
            this.studentName = studentName;
            this.studentID = studentID;
            System.out.println("Student: " + studentName + " is created");
        }

        public void attendance() {

        }

        public String getMajor() {
            System.out.println("The student major is : " + major);
            return major;
        }

        public String getDegree() {
            System.out.println("The student degree is : " + degree);
            return degree;
        }
    }

    public static void main(String[] args) {
        School school1 = new School("NEU", "4N 2nd St.", 1898);
        School school2 = new School("SFU", "123 St.", 1800);
        School school3 = new School("UW", "456 St.", 1900);

        ClassRoom classroom1 = school1.new ClassRoom("room 101");
        ClassRoom classroom2 = school2.new ClassRoom("room 102");
        ClassRoom classroom3 = school3.new ClassRoom("room 103");

        Student student1 = school1.new Student("John", "001233910");
        Student student2 = school2.new Student("Bob", "001454633");
        Student student3 = school3.new Student("Judy", "006564652");
    }
}
