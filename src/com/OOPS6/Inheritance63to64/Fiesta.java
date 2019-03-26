package com.OOPS6.Inheritance63to64;

public class Fiesta extends Vehicle {

    private String model;
    private double engineSize;

    public Fiesta(String make, String country, int year, String model, double engineSize) {
        super(make, country, year);
        this.model = model;
        this.engineSize = engineSize;
    }
}
