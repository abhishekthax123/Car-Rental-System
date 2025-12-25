/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
/**
 *
 * @author abhishekkumarthakur
 */
public class User {

    private String name;
    private String carModel;
    private String reserveDate;

    // Constructor
    public User(String name, String carModel, String reserveDate) {
        this.name = name;
        this.carModel = carModel;
        this.reserveDate = reserveDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getReserveDate() {
        return reserveDate;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setReserveDate(String reserveDate) {
        this.reserveDate = reserveDate;
    }
}
