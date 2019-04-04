package com.OOPS6._63to69Inheritance.Challange;

public class Main extends Object{

    public static void main(String args[]){
        /*
        Challange
        - Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        - Finally create another class, a specific type of Car that inherits from the Car class
        - You should be able to hand steering, changing geers, and moving(speed in other words)
        - You will want to decide where to put the appropriate state and behaviour(field and method)
        - As mentioned above, changing gears, increasing/decreasing speed should be included
        - For a specific type of vehicle you will want to add something specific for that type of car
        -
         */

        Mercedes mercedes = new Mercedes("Hatchback","Mercedes", "A55",1994,"Blue","Hatchback", 2.0, "Petrol",80 );
        mercedes.navigateVehicle();
    }


}
