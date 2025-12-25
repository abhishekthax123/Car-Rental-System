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
public class SearchController {

    // Binary Search by ID
    public static Car searchById(ArrayList<Car> list, String key) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = list.get(mid).getCarId().compareToIgnoreCase(key);

            if (cmp == 0) return list.get(mid);
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    // Binary Search by Model
    public static Car searchByModel(ArrayList<Car> list, String key) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = list.get(mid).getModel().compareToIgnoreCase(key);

            if (cmp == 0) return list.get(mid);
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }

    // Binary Search by Brand
    public static Car searchByBrand(ArrayList<Car> list, String key) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = list.get(mid).getBrand().compareToIgnoreCase(key);

            if (cmp == 0) return list.get(mid);
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}