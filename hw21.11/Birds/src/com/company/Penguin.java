package com.company;

public class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        layEggs();
        super.fly();
        System.out.println(" It is a penguin. ");
    }
}
