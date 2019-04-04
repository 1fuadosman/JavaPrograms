package com.OOPS6.Inheritance63to69.Challange;

public class Mercedes extends Car {

    public Mercedes(String vehicleType, String make, String model, int year, String colour, String carType, double engineSize, String fuelType, int co2Emissions) {
        super(vehicleType, make, model, year, colour, carType, engineSize, fuelType, co2Emissions);
    }

    public void navigateVehicle() {
        move(10);
        accelerate(50);
        steerCar("left");
        steerCar("Right");
        decelerate(20);
    }
}
