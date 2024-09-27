
package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    viewEmployees();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Employee Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        String id = scanner.nextLine();
        employees.add(new Employee(name, id));
        System.out.println("Employee added: " + name + " (ID: " + id + ")");
    }

    private static void removeEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees to remove.");
        } else {
            viewEmployees();
            System.out.print("Enter the employee number to remove: ");
            int employeeNumber = scanner.nextInt();
            if (employeeNumber > 0 && employeeNumber <= employees.size()) {
                Employee removedEmployee = employees.remove(employeeNumber - 1);
                System.out.println("Removed employee: " + removedEmployee.getName());
            } else {
                System.out.println("Invalid employee number.");
            }
        }
    }

    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            System.out.println("\nEmployee List:");
            for (int i = 0; i < employees.size(); i++) {
                Employee employee = employees.get(i);
                System.out.println((i + 1) + ". " + employee.getName() + " (ID: " + employee.getId() + ")");
            }
        }
    }
}

// Helper class for employee information
class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
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

