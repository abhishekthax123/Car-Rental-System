/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Stack;

/**
 *
 * @author abhishekkumarthakur
 */
public class CarReservation {
    
    // Stack to keep track of reserved cars
    private static Stack<String> reservedCarsStack = new Stack<>();
    
    // Total number of cars
    private static final int totalCars = 20;
    
    // Reserved cars and available cars
    private static int reservedCars = 0;
    private static int availableCars = totalCars - reservedCars;

    // Add a reservation (i.e., add a car to the reserved stack)
    public static void addReservation(String carId) {
        if (availableCars > 0) {
            reservedCarsStack.push(carId);
            reservedCars++;
            availableCars = totalCars - reservedCars; // Recalculate available cars
            System.out.println("Reservation successful! Reserved Cars: " + reservedCars + ", Available Cars: " + availableCars);
            // Automatically update the car status here if needed
        } else {
            System.out.println("No cars available for reservation.");
        }
    }

    // Cancel a reservation (i.e., remove a car from the reserved stack)
    public static void cancelReservation() {
        if (!reservedCarsStack.isEmpty()) {
            String carId = reservedCarsStack.pop(); // Remove the last reserved car
            reservedCars--;
            availableCars = totalCars - reservedCars; // Recalculate available cars
            System.out.println("Reservation cancelled! Reserved Cars: " + reservedCars + ", Available Cars: " + availableCars);
            // Automatically update the car status here if needed
        } else {
            System.out.println("No reservations to cancel.");
        }
    }

    // Get current status of cars
    public static int getTotalCars() {
        return totalCars;
    }

    public static int getReservedCars() {
        return reservedCars;
    }

    public static int getAvailableCars() {
        return availableCars;
    }

    // Get list of all reservations (for the table)
    public static Stack<String> getReservedCarsStack() {
        return reservedCarsStack;
    }
}
