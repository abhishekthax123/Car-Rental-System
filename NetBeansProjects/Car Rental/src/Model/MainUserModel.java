/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author abhishekkumarthakur
 */
public class MainUserModel {

    private static ArrayList<MainUser> userList = new ArrayList<>();

    // Add a user (add a new booking)
    public static void addUser(MainUser user) {
        userList.add(user);
    }

    // Check if a user with the given name exists
    public static boolean exists(String userName) {
        for (MainUser user : userList) {
            if (user.getFullName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    // Update user details by User Name
    public static boolean updateUser(String userName, MainUser updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            MainUser user = userList.get(i);
            if (user.getFullName().equals(userName)) {
                // Update the user details
                userList.set(i, updatedUser);  // Replace the old user with the updated user
                return true;
            }
        }
        return false;  // User not found
    }

    // Get all users (current bookings)
    public static ArrayList<MainUser> getAllUsers() {
        return userList;
    }

    // Delete user by User Name
    public static boolean deleteUserByName(String userName) {
        return userList.removeIf(user -> user.getFullName().equals(userName));
    }
}
