package com.OOPS6._75to76Encapsulation.noEncapsulation;

public class Main {

    public static void main(String args[]){

        //One issue with using public variables, if the blueprint class variable is changed
        //then you need to change it everywhere else thats using it

        Player player = new Player(); // not because we havent created a constructor, default parameterless constructror is plassed
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.looseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health =200; //note by accessing the fields directly, we're able to change the rules which is not good
        player.looseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());





    }
}
