package com.OOPS6._75to76Encapsulation.noEncapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

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
}
