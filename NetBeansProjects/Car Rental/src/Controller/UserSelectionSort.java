/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.util.List;
import Model.User;
/**
 *
 * @author abhishekkumarthakur
 */
public class UserSelectionSort {

    // Selection Sort by Name
    public static void sortByName(List<User> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getName().compareToIgnoreCase(list.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            User temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Selection Sort by Car Model
    public static void sortByCarModel(List<User> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getCarModel().compareToIgnoreCase(list.get(minIndex).getCarModel()) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            User temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    // Selection Sort by Reserve Date
    public static void sortByReserveDate(List<User> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j).getReserveDate().compareToIgnoreCase(list.get(minIndex).getReserveDate()) < 0) {
                    minIndex = j;
                }
            }
            // Swap
            User temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}