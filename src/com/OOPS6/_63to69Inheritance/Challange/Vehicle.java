package com.OOPS6._63to69Inheritance.Challange;

public class Vehicle {

    private String vehicleType;
    private String make;
    private String model;
    private int Year;
    private String Colour;

    public Vehicle(String vehicleType, String make, String model, int year, String colour) {
        this.vehicleType = vehicleType;
        this.make = make;
        this.model = model;
        Year = year;
        Colour = colour;
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called");
        System.out.println("Vehicle is on a move at :" + speed);
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return Year;
    }

    public String getColour() {
        return Colour;
    }
}
