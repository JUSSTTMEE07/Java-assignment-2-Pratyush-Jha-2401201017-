package service;

import model.Student;
import java.util.*;

public class StudentManager implements RecordActions {
    private Map<Integer, Student> studentMap;

    public StudentManager() {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent(Student student) {
        if(studentMap.containsKey(student.getRollNo())) {
            System.out.println("Duplicate Roll No not allowed: " + student.getRollNo());
        } else {
            studentMap.put(student.getRollNo(), student);
            System.out.println("Student added successfully.");
        }
    }

    @Override
    public void deleteStudent(int rollNo) {
        if(studentMap.remove(rollNo) != null) {
            System.out.println("Student with Roll No " + rollNo + " deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    @Override
    public void updateStudent(int rollNo, Student updatedStudent) {
        if(studentMap.containsKey(rollNo)) {
            studentMap.put(rollNo, updatedStudent);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    @Override
    public Student searchStudent(int rollNo) {
        return studentMap.get(rollNo);
    }

    @Override
    public List<Student> viewAllStudents() {
        return new ArrayList<>(studentMap.values());
    }
}
