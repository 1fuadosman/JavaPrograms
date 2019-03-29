package com.OOPS6.Inheritance63to64;

public class Main {

    public static void main(String args []) {
        Dog dog = new Dog(20,30, "dog", 2,2,1,30, "Fur" );

        //Inheritance allows the dog object to inherit the properties(methods/variables) of the animal class
        //below the eat() method is being called thats available in the dog class
        //the "super" super.eat() calls the eat() method in the class thats being inherited
        //And so the dog.eat() gets properties specific to dog but also general to animals.

        dog.eat();

    }
}
