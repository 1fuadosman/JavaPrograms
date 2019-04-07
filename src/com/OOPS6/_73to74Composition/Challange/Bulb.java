package com.OOPS6._73to74Composition.Challange;

public class Bulb {

    private String power;

    public Bulb(String power) {
        this.power = power;
    }

    public void switchOn() {
        System.out.println("Switching on light. For your information, the power is " + power + "watts.");
    }

    public String getPower() {
        return power;
    }
}
