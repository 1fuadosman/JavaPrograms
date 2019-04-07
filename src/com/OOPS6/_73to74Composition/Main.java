package com.OOPS6._73to74Composition;

public class Main {

    public static void main(String args[]) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2200", "Dell","240", dimensions );
        //Resolution is a class created on the fly.
        //This is useful because you dont need to create a variable for the instance as your only it for a specific purposse
        //So an instance of a class is created without using a variable
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("B3-200", "Asus", 4, 6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        thePC.powerUp();



    }
}
