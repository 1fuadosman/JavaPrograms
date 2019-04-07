package com.OOPS6._75to76Encapsulation.withEncapsulation;

public class Player {

    private String name;
    private int health=100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health<=100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health<=0) {
            System.out.println("Player knocked out");
            // eg can put reduce number of lives raining for the user
        }
    }

    public int healthRemaining() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
