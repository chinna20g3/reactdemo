
package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRental {
    private static ArrayList<Car> cars = new ArrayList<>();
    private static ArrayList<Car> rentedCars = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample cars
        cars.add(new Car("Toyota Corolla"));
        cars.add(new Car("Honda Civic"));
        cars.add(new Car("Ford Focus"));

        boolean quit = false;

        while (!quit) {
            System.out.println("\nWelcome to the Car Rental System");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. View Rented Cars");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    viewAvailableCars();
                    break;
                case 2:
                    rentCar();
                    break;
                case 3:
                    returnCar();
                    break;
                case 4:
                    viewRentedCars();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting Car Rental System.");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void viewAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            if (!car.isRented()) {
                System.out.println((i + 1) + ". " + car.getModel());
            }
        }
    }

    private static void rentCar() {
        viewAvailableCars();
        System.out.print("Enter the car number to rent: ");
        int carNumber = scanner.nextInt();
        if (carNumber > 0 && carNumber <= cars.size()) {
            Car car = cars.get(carNumber - 1);
            if (!car.isRented()) {
                car.setRented(true);
                rentedCars.add(car);
                System.out.println("Car rented: " + car.getModel());
            } else {
                System.out.println("Car is already rented.");
            }
        } else {
            System.out.println("Invalid car number.");
        }
    }

    private static void returnCar() {
        viewRentedCars();
        System.out.print("Enter the car number to return: ");
        int carNumber = scanner.nextInt();
        if (carNumber > 0 && carNumber <= rentedCars.size()) {
            Car car = rentedCars.remove(carNumber - 1);
            car.setRented(false);
            System.out.println("Car returned: " + car.getModel());
        } else {
            System.out.println("Invalid car number.");
        }
    }

    private static void viewRentedCars() {
        System.out.println("\nRented Cars:");
        if (rentedCars.isEmpty()) {
            System.out.println("No cars rented.");
        } else {
            for (int i = 0; i < rentedCars.size(); i++) {
                Car car = rentedCars.get(i);
                System.out.println((i + 1) + ". " + car.getModel());
            }
        }
    }
}

// Helper class for car information
class Car {
    private String model;
    private boolean rented;

    public Car(String model) {
        this.model = model;
        this.rented = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}

