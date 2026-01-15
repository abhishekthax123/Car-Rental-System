/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author abhishekkumarthakur
 */

public class Car {
    private String carId;
    private String model;
    private String brand;
    private boolean isRented;  // Field to indicate if the car is rented
    private String id;

    // Constructor to initialize car details and set the rental status
    public Car(String carId, String model, String brand) {
        this.carId = carId;
        this.model = model;
        this.brand = brand;
        this.isRented = false; // Cars are not rented by default
    }

    // Getters
    public String getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isRented() {
        return isRented; // Return the rented status of the car
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRented(boolean rented) {
        isRented = rented; // Set the rented status of the car
    }
    // ADD THIS METHOD TO FIX THE ERROR
    public String getId() {
        return id;
    }
}