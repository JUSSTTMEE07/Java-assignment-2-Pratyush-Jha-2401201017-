package model;

public class Student extends Person {
    private int rollNo;
    private String course;
    private double marks;
    private String grade;

    public Student(int rollNo, String name, String email, String course, double marks, String grade) {
        super(name, email);
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
        this.grade = grade;
    }

    // Getter methods
    public int getRollNo() { return rollNo; }
    public String getCourse() { return course; }
    public double getMarks() { return marks; }
    public String getGrade() { return grade; }

    @Override
    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }

    // Method overloading (polymorphism)
    public void displayInfo(boolean shortVersion) {
        if(shortVersion) {
            System.out.println("Student Info (Short):");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        } else {
            displayInfo();
        }
    }
}
