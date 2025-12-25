/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Queue;

public class CarModel {
    private static ArrayList<Car> carList = new ArrayList<>();

    // Add a car
    public static void addCar(Car car) {
        carList.add(car);
    }

    // Check if a car with the given ID exists
    public static boolean exists(String carId) {
        for (Car car : carList) {
            if (car.getCarId().equals(carId)) {
                return true;
            }
        }
        return false;
    }

    // Update car details by Car ID
    public static boolean updateCar(String carId, Car updatedCar) {
        for (int i = 0; i < carList.size(); i++) {
            Car car = carList.get(i);
            if (car.getCarId().equals(carId)) {
                // Update the car details
                carList.set(i, updatedCar); // Replace the old car with the updated car
                return true;
            }
        }
        return false; // Car ID not found
    }

    // Get all cars
    public static ArrayList<Car> getAllCars() {
        return carList;
    }

    // Delete car by Car ID
    public static boolean deleteCarById(String carId) {
        return carList.removeIf(car -> car.getCarId().equals(carId));
    }
}
