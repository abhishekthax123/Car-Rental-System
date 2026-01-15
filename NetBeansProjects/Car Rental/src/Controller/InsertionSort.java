/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Car;
import java.util.List;

/**
 *
 * @author abhishekkumarthakur
 */
public class InsertionSort {
    // Insertion Sort by Car ID
    public static void sortById(List<Car> list) {
        for (int i = 1; i < list.size(); i++) {
            Car key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getCarId()
                    .compareToIgnoreCase(key.getCarId()) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    // Insertion Sort by Model
    public static void sortByModel(List<Car> list) {
        for (int i = 1; i < list.size(); i++) {
            Car key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getModel()
                    .compareToIgnoreCase(key.getModel()) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    // Insertion Sort by Brand
    public static void sortByBrand(List<Car> list) {
        for (int i = 1; i < list.size(); i++) {
            Car key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j).getBrand()
                    .compareToIgnoreCase(key.getBrand()) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
