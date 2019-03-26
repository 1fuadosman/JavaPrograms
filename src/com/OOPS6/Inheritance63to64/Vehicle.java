package com.OOPS6.Inheritance63to64;

public class Vehicle {
    private String make;
    private String Country;
    private int year;

    public Vehicle(String make, String country, int year) {
        this.make = make;
        Country = country;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getCountry() {
        return Country;
    }

    public int getYear() {
        return year;
    }
}
