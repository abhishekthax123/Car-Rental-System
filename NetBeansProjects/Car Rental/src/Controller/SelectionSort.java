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

public class SelectionSort {

    // Selection Sort by Car ID
    public static void sortById(List<Car> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getCarId()
                        .compareToIgnoreCase(list.get(minIndex).getCarId()) < 0) {
                    minIndex = j;
                }
            }

            Car temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Selection Sort by Model
    public static void sortByModel(List<Car> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getModel()
                        .compareToIgnoreCase(list.get(minIndex).getModel()) < 0) {
                    minIndex = j;
                }
            }

            Car temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Selection Sort by Brand
    public static void sortByBrand(List<Car> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getBrand()
                        .compareToIgnoreCase(list.get(minIndex).getBrand()) < 0) {
                    minIndex = j;
                }
            }

            Car temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}