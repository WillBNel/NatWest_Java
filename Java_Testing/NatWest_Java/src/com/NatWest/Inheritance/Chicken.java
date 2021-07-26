package com.NatWest.Inheritance;

public class Chicken extends Bird {

    private int eggCount = 0;

    public void doThing(){
        System.out.println("Egg Count: " + this.eggCount + " Flight? " + super.getFly());
    }

    public void cluck() {
        System.out.println("bwark");
    }

}
