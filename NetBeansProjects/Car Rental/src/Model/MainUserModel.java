/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author abhishekkumarthakur
 */
public class MainUserModel {

     private static ArrayList<MainUser> userList = new ArrayList<>();
    private static Stack<MainUser> deletedUsers = new Stack<>();
    private static final int STACK_LIMIT = 5;

    // ADD USER
    public static void addUser(MainUser user) {
        userList.add(user);
    }

    // CHECK DUPLICATE
    public static boolean exists(String name) {
        for (MainUser u : userList) {
            if (u.getFullName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // GET USERS (FOR TABLE)
    public static ArrayList<MainUser> getAllUsers() {
        return userList;
    }

    // DELETE USER (PUSH TO STACK)
    public static boolean deleteUserByName(String name) {
        for (int i = 0; i < userList.size(); i++) {
            MainUser user = userList.get(i);

            if (user.getFullName().equalsIgnoreCase(name)) {

                if (deletedUsers.size() >= STACK_LIMIT) {
                    return false; // STACK FULL
                }

                deletedUsers.push(user);
                userList.remove(i);
                return true;
            }
        }
        return false; // NOT FOUND
    }

    // UNDO DELETE (POP)
    public static boolean undoDelete() {
        if (deletedUsers.isEmpty()) {
            return false;
        }

        userList.add(deletedUsers.pop());
        return true;
    }

    public static boolean isStackFull() {
        return deletedUsers.size() >= STACK_LIMIT;
    }

    public static boolean isStackEmpty() {
        return deletedUsers.isEmpty();
    }
    
    public static boolean updateUser(String userName, MainUser updatedUser) {
    for (int i = 0; i < userList.size(); i++) {
        if (userList.get(i).getFullName().equalsIgnoreCase(userName)) {
            userList.set(i, updatedUser);
            return true;
        }
    }
    return false;
    }
}

    

    
    
