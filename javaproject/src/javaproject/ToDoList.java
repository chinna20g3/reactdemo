package javaproject;


import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> toDoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while (!quit) {
            System.out.println("\nWelcome to the To-Do List App");
            System.out.println("1. Add a new task");
            System.out.println("2. Remove a task");
            System.out.println("3. View all tasks");
            System.out.println("4. Mark a task as completed");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    viewTasks();
                    break;
                case 4:
                    markTaskCompleted();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting To-Do List App.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    private static void removeTask() {
        if (toDoList.isEmpty()) {
            System.out.println("To-do list is empty.");
        } else {
            viewTasks();
            System.out.print("Enter the task number to remove: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                String removedTask = toDoList.remove(taskNumber - 1);
                System.out.println("Task removed: " + removedTask);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }

    private static void viewTasks() {
        if (toDoList.isEmpty()) {
            System.out.println("To-do list is empty.");
        } else {
            System.out.println("\nYour To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    private static void markTaskCompleted() {
        if (toDoList.isEmpty()) {
            System.out.println("To-do list is empty.");
        } else {
            viewTasks();
            System.out.print("Enter the task number to mark as completed: ");
            int taskNumber = scanner.nextInt();
            if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                String task = toDoList.get(taskNumber - 1);
                toDoList.set(taskNumber - 1, task + " [Completed]");
                System.out.println("Task marked as completed: " + task);
            } else {
                System.out.println("Invalid task number.");
            }
        }
    }
}
