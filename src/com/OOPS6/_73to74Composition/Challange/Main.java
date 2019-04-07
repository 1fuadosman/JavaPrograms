package com.OOPS6._73to74Composition.Challange;

import java.io.BufferedWriter;

public class Main {

    public static void main(String args[]){
        /*
        * Create a single room of a house using composition
        * Think about the things that should be included in the room
        * Maybe physical parts of the house but furniture as well
        * Add at least one method to access an object via a getter and
        * then that bobjects public method as you saw in the previous video
        * then add at least one method to hide the object eg not using a getter
        * but to access the object used in composition within the main class
        * like you saw in this video
         */

        Wall wall1 = new Wall("South","Beige");
        Wall wall2 = new Wall("West", "Beige");
        Wall wall3 = new Wall("East", "Beige");
        Wall wall4 = new Wall("North", "Beige");
        Windows window1 = new Windows("North", new Dimensions(20, 35));
        Windows window2 = new Windows("North", new Dimensions(20, 35));
        Sofa sofa = new Sofa("Ikea", "Brown");
        Television tv = new Television("Sony", "45inch");
        Bulb bulb = new Bulb("100");

        LivingRoom livingRoom = new LivingRoom(wall1, wall2, wall3, wall4, window1, window2,sofa, tv,bulb);
        livingRoom.turnOnElectronics();
    }
}
