package com.OOPS6._63to69Inheritance;

public class Main {

    public static void main(String args []) {
        Dog dog = new Dog(20,30, "dog", 2,2,1,30, "Fur" );

        //Inheritance allows the dog object to inherit the properties(methods/variables) of the animal class
        //below the eat() method is being called thats available in the dog class
        //the "super" super.eat() calls the eat() method in the class thats being inherited
        //And so the dog.eat() gets properties specific to dog but also general to animals.
        //dog.eat();
        //System.out.println("+++++++++++++++++++++++++++");


        //In the below example, a move(int speed) has been created in the parent class that are inherited by dog
        //The dog can either walk or run
        //so two methods have been specified, walk() & run() that call the move.
        dog.walk();
        System.out.println("+++++++++++++++++++++++++++");
        dog.run();

        System.out.println("+++++++++Fish example+++++++++++++++");
        Fish fish = new Fish(20,40,"shark",10, 2,1);
        fish.move(20);

    }
}
