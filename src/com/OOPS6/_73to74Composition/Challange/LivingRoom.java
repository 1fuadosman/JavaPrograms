package com.OOPS6._73to74Composition.Challange;

public class LivingRoom {

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Windows window1;
    private Windows window2;
    private Sofa sofa;
    private Television tv;
    private Bulb bulb;

    public LivingRoom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Windows window1, Windows window2, Sofa sofa, Television tv, Bulb bulb) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.window1 = window1;
        this.window2 = window2;
        this.sofa = sofa;
        this.tv = tv;
        this.bulb = bulb;
    }

    public void turnOnElectronics() {
        bulb.switchOn();
        tv.switchOn();
    }

    public void switchOnTv() {

    }



}
