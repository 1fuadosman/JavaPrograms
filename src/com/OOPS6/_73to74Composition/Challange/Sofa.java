package com.OOPS6._73to74Composition.Challange;

public class Sofa {

    private String make;
    private String colour;

    public Sofa(String make, String colour) {
        this.make = make;
        this.colour = colour;
    }

    public void getSofaDescription() {
        System.out.println("The sofa is " + colour + " by " + make + ".");
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }
}
