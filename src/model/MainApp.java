import model.Student;
import service.StudentManager;

public class MainApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Ankit", "ankit@mail.com", "B.Tech", 85.5, "A");
        Student s2 = new Student(102, "Riya", "riya@mail.com", "M.Tech", 90.0, "A+");

        manager.addStudent(s1);
        manager.addStudent(s2);

        // Display all students
        for(Student s : manager.viewAllStudents()) {
            s.displayInfo();
            System.out.println();
        }

        // Overloaded method call
        s1.displayInfo(true);

        // Search student
        Student found = manager.searchStudent(101);
        if(found != null) {
            System.out.println("\nFound student:");
            found.displayInfo();
        }
    }
}
