package com.company;

public class Swallow extends FlyingBird {
    @Override
    public void fly() {
        feathers();
        super.fly();
        System.out.println(" It is a swallow. ");
    }
}
