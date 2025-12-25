/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.User;
import java.util.ArrayList;
/**
 *
 * @author abhishekkumarthakur
 */

public class UserSearchController {

    // Binary Search by Name
    public static User searchByName(ArrayList<User> list, String key) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = list.get(mid).getName().compareToIgnoreCase(key);

            if (cmp == 0) return list.get(mid); // Found user
            if (cmp < 0) low = mid + 1;  // Search the right half
            else high = mid - 1; // Search the left half
        }
        return null; // User not found
    }

    // Binary Search by Car Model
    public static User searchByCarModel(ArrayList<User> list, String key) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = list.get(mid).getCarModel().compareToIgnoreCase(key);

            if (cmp == 0) return list.get(mid); // Found user
            if (cmp < 0) low = mid + 1;  // Search the right half
            else high = mid - 1; // Search the left half
        }
        return null; // User not found
    }

    // Binary Search by Reserve Date
    public static User searchByReserveDate(ArrayList<User> list, String key) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = list.get(mid).getReserveDate().compareToIgnoreCase(key);

            if (cmp == 0) return list.get(mid); // Found user
            if (cmp < 0) low = mid + 1;  // Search the right half
            else high = mid - 1; // Search the left half
        }
        return null; // User not found
    }
}