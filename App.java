import src.Student;
import src.StudentManager;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while (true) {
            System.out.println("------ Enter the number: ");
            System.out.println("1: Add a new student: ");
            System.out.println("2: Remove a student: ");
            System.out.println("3: Update a student: ");
            System.out.println("4: Show the list of students: ");
            System.out.println("5: Filter student by name: ");
            System.out.println("0: Exit! ");
            System.out.println("---------------------- ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter the email: ");
                    String email = scanner.nextLine();
                    // regex Email


                    Student newStudent = new Student(name, email);
                    studentManager.addStudent(newStudent);
                    break;
                case 2:
                    // Remove a student
                    break;
                case 3:
                    // Update a student
                    break;
                case 4:
                    studentManager.showList();
                    break;
                case 0:
                    // Exit!
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
