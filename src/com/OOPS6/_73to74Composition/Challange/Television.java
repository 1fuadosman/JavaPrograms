package com.OOPS6._73to74Composition.Challange;

public class Television {
    private String make;
    private String size;

    public Television(String make, String size) {
        this.make = make;
        this.size = size;
    }

    public void switchOn() {
        System.out.println("Switching " + make + " tv on......");
    }

    public String getMake() {
        return make;
    }

    public String getSize() {
        return size;
    }
}
