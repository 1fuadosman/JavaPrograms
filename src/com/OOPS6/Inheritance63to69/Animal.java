package com.OOPS6.Inheritance63to69;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal.eat() called");

    }

    public void move(int speed){
        System.out.println("Animal.move() called");
        System.out.println("Animal is moving at " + speed);
    }




}
