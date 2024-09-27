

package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        while (!quit) {
            System.out.println("\nWelcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View Students");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    viewStudents();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Student Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        students.add(new Student(name, id));
        System.out.println("Student added: " + name + " (ID: " + id + ")");
    }

    private static void removeStudent() {
        if (students.isEmpty()) {
            System.out.println("No students to remove.");
        } else {
            viewStudents();
            System.out.print("Enter the student number to remove: ");
            int studentNumber = scanner.nextInt();
            if (studentNumber > 0 && studentNumber <= students.size()) {
                Student removedStudent = students.remove(studentNumber - 1);
                System.out.println("Removed student: " + removedStudent.getName());
            } else {
                System.out.println("Invalid student number.");
            }
        }
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("\nStudent List:");
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                System.out.println((i + 1) + ". " + student.getName() + " (ID: " + student.getId() + ")");
            }
        }
    }
}

// Helper class for student information
class Student {
    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
