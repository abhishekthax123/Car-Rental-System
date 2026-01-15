/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class CarModel {
    private static final int MAX_SIZE = 5;
    private static Car[] carQueue = new Car[MAX_SIZE];
    private static int count = 0;

    private static int rentedCarsCount = 0;

    // ================= ADD CAR =================
    public static boolean addCar(Car car) {
        if (count >= MAX_SIZE) {
            return false; // Queue full
        }
        carQueue[count++] = car;
        return true;
    }

    // ================= CHECK DUPLICATE =================
    public static boolean exists(String id) {
        for (int i = 0; i < count; i++) {
            if (carQueue[i].getCarId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    // ================= DELETE CAR =================
    public static boolean deleteCarById(String carId) {
        for (int i = 0; i < count; i++) {
            if (carQueue[i].getCarId().equals(carId)) {

                // Shift elements left (queue behavior)
                for (int j = i; j < count - 1; j++) {
                    carQueue[j] = carQueue[j + 1];
                }

                carQueue[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    // ================= UPDATE CAR =================
    public static boolean updateCar(String carId, Car updatedCar) {
        for (int i = 0; i < count; i++) {
            if (carQueue[i].getCarId().equals(carId)) {
                carQueue[i] = updatedCar;
                return true;
            }
        }
        return false;
    }

    // ================= GET ALL CARS =================
    public static ArrayList<Car> getAllCars() {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(carQueue[i]);
        }
        return list;
    }

    // ================= QUEUE UTILITIES =================
    public static int getCurrentSize() {
        return count;
    }

    public static boolean isFull() {
        return count == MAX_SIZE;
    }

    // ================= RENTED CARS COUNT =================
    public static int getRentedCarsCount() {
        return rentedCarsCount;
    }

    public static void incrementRentedCars() {
        rentedCarsCount++;
    }

    public static void decrementRentedCars() {
        if (rentedCarsCount > 0) {
            rentedCarsCount--; 
        }
    }

    // ================= SEARCH BY MODEL =================
    public static Car getCarByModel(String model) {
        for (int i = 0; i < count; i++) {
            if (carQueue[i].getModel().equalsIgnoreCase(model)) {
                return carQueue[i];
            }
        }
        return null;
    }
    
}
