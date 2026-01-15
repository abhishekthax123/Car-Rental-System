/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Car;
import java.util.ArrayList;

/**
 *
 * @author abhishekkumarthakur
 */
public class LinearSearch {
    // Search Car by ID
    public static Car searchById(ArrayList<Car> list, String key) {
        for (Car car : list) {
            if (car.getCarId().equalsIgnoreCase(key)) {
                return car;
            }
        }
        return null;
    }

    // Search Car by Model
    public static Car searchByModel(ArrayList<Car> list, String key) {
        for (Car car : list) {
            if (car.getModel().equalsIgnoreCase(key)) {
                return car;
            }
        }
        return null;
    }

    // Search Car by Brand
    public static Car searchByBrand(ArrayList<Car> list, String key) {
        for (Car car : list) {
            if (car.getBrand().equalsIgnoreCase(key)) {
                return car;
            }
        }
        return null;
    }
    
}
