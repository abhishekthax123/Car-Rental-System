/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;
import java.util.Queue;

public class UserModel {

    // Using LinkedList as the Queue implementation for storing users
    private static Queue<User> userQueue = new LinkedList<>();

    // Add a user to the queue
    public static void addUser(User user) {
        userQueue.offer(user);  // Adds the user to the end of the queue
    }

    // Check if a user with the given name exists
    public static boolean exists(String userName) {
        for (User user : userQueue) {
            if (user.getName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    // Update user details by User Name
    public static boolean updateUser(String userName, User updatedUser) {
        for (User user : userQueue) {
            if (user.getName().equals(userName)) {
                // Remove the old user and add the updated one
                userQueue.remove(user);  // Remove the old user
                userQueue.offer(updatedUser);  // Add the updated user to the queue
                return true;
            }
        }
        return false;  // User not found
    }

    // Get all users
    public static Queue<User> getAllUsers() {
        return userQueue;  // Returns the entire queue
    }

    // Delete user by User Name
    public static boolean deleteUserByName(String userName) {
        return userQueue.removeIf(user -> user.getName().equals(userName));  // Removes the user by name
    }

    // Get and remove the first user from the queue
    public static User getAndRemoveFirstUser() {
        return userQueue.poll();  // Removes and returns the first user in the queue
    }

    // Peek the first user (without removing it)
    public static User peekFirstUser() {
        return userQueue.peek();  // Returns the first user without removing it
    }
}
