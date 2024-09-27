

package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagement {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Hospital Management System");
            System.out.println("1. Admit Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. View Patients");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    admitPatient();
                    break;
                case 2:
                    dischargePatient();
                    break;
                case 3:
                    viewPatients();
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting Hospital Management System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void admitPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient ID: ");
        String id = scanner.nextLine();
        patients.add(new Patient(name, id));
        System.out.println("Patient admitted: " + name + " (ID: " + id + ")");
    }

    private static void dischargePatient() {
        if (patients.isEmpty()) {
            System.out.println("No patients to discharge.");
        } else {
            viewPatients();
            System.out.print("Enter the patient number to discharge: ");
            int patientNumber = scanner.nextInt();
            if (patientNumber > 0 && patientNumber <= patients.size()) {
                Patient dischargedPatient = patients.remove(patientNumber - 1);
                System.out.println("Discharged patient: " + dischargedPatient.getName());
            } else {
                System.out.println("Invalid patient number.");
            }
        }
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients available.");
        } else {
            System.out.println("\nPatient List:");
            for (int i = 0; i < patients.size(); i++) {
                Patient patient = patients.get(i);
                System.out.println((i + 1) + ". " + patient.getName() + " (ID: " + patient.getId() + ")");
            }
        }
    }
}

// Helper class for patient information
class Patient {
    private String name;
    private String id;

    public Patient(String name, String id) {
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

