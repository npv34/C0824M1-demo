package src;

import java.util.List;

public interface ManagerInterface {
    void showList();
    void addStudent(Student student);
    void removeStudent(Student student);
    void updateStudent(int idStudent, Student student);
    List<Student> filterStudentByName(String name);
    List<Student> sortStudentById();
}
