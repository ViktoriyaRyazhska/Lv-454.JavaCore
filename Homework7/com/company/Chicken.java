package com.company;

public class Chicken extends com.company.NonFlyingBird {
    @Override
    public void fly() {
        System.out.println("I am chichen ");
        super.fly();

    }
}
