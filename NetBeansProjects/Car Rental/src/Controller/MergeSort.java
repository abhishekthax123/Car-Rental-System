/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Car;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abhishekkumarthakur
 */
public class MergeSort {
    
    
    // Merge Sort by Car ID
    public static void sortById(List<Car> list) {
        if (list.size() <= 1) return;

        int mid = list.size() / 2;
        List<Car> left = new ArrayList<>(list.subList(0, mid));
        List<Car> right = new ArrayList<>(list.subList(mid, list.size()));

        sortById(left);
        sortById(right);

        mergeById(list, left, right);
    }

    private static void mergeById(List<Car> list, List<Car> left, List<Car> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getCarId()
                    .compareToIgnoreCase(right.get(j).getCarId()) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
    }

    // Merge Sort by Model
    public static void sortByModel(List<Car> list) {
        if (list.size() <= 1) return;

        int mid = list.size() / 2;
        List<Car> left = new ArrayList<>(list.subList(0, mid));
        List<Car> right = new ArrayList<>(list.subList(mid, list.size()));

        sortByModel(left);
        sortByModel(right);

        mergeByModel(list, left, right);
    }

    private static void mergeByModel(List<Car> list, List<Car> left, List<Car> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getModel()
                    .compareToIgnoreCase(right.get(j).getModel()) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
    }

    // Merge Sort by Brand
    public static void sortByBrand(List<Car> list) {
        if (list.size() <= 1) return;

        int mid = list.size() / 2;
        List<Car> left = new ArrayList<>(list.subList(0, mid));
        List<Car> right = new ArrayList<>(list.subList(mid, list.size()));

        sortByBrand(left);
        sortByBrand(right);

        mergeByBrand(list, left, right);
    }

    private static void mergeByBrand(List<Car> list, List<Car> left, List<Car> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getBrand()
                    .compareToIgnoreCase(right.get(j).getBrand()) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
    }
}
