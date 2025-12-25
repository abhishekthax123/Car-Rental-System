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
public class MainUser {

    private String fullName;  // User's full name
    private String carModel;  // Model of the car reserved
    private String reserveDate; // Reservation date

    // Constructor to initialize the user
    public MainUser(String fullName, String carModel, String reserveDate) {
        this.fullName = fullName;
        this.carModel = carModel;
        this.reserveDate = reserveDate;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    // Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }
}