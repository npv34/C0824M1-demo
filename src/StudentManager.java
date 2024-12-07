package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager implements ManagerInterface{
    private int numberID;
    private List<Student> listStudent;
    public StudentManager() {
        numberID = 1;
        listStudent = new ArrayList<>();
    }
    @Override
    public void showList() {
        System.out.println("-----ListStudent-----");
        for (Student student : listStudent) {
            System.out.println(student);
        }
        System.out.println("-----ListStudent End-----");
    }

    @Override
    public void addStudent(Student student) {
        student.setId(numberID);
        listStudent.add(student);
        numberID++;
        System.out.println("----Add new student successfully");
    }

    @Override
    public void removeStudent(Student student) {

    }

    @Override
    public void updateStudent(int idStudent, Student student) {

    }

    @Override
    public List<Student> filterStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : listStudent) {
            if (student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public List<Student> sortStudentById() {
        return Collections.emptyList();
    }
}
