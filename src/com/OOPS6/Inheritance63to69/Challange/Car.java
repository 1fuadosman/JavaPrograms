package com.OOPS6.Inheritance63to69.Challange;

public class Car extends Vehicle {

    private String carType;
    private double engineSize;
    private String fuelType;
    private int co2Emissions;

    public Car(String vehicleType, String make, String model, int year, String colour, String carType, double engineSize, String fuelType, int co2Emissions) {
        super(vehicleType, make, model, year, colour);
        this.carType = carType;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.co2Emissions = co2Emissions;
    }

    public void changeGears(int gear) {
        System.out.println("Car.changeGears() called");
        System.out.println("Changing to gear: " +  gear);
    }

    public void steerCar(String direction) {
        System.out.println("Car.csteerCar called");
        System.out.println("Car.steerCar() " + direction);
    }

    public void accelerate(int speed) {
        System.out.println("Car.accelerate() called");
        System.out.println(getMake() + " accelerating at :" + speed + "mph");
    }

    public void decelerate(int speed) {
        System.out.println("Car.decelerate() called");
        System.out.println(getMake() + " decelerating at :" + speed + "mph");
    }

    public String getCarType() {
        return carType;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getCo2Emissions() {
        return co2Emissions;
    }
}
