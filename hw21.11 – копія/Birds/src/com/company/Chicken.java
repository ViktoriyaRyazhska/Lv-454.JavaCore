package com.company;

public class Chicken extends NonFlyingBird {
    @Override
    public void fly() {
        layEggs();
        super.fly();
        System.out.println(" It is a chicken. ");
            }
}
