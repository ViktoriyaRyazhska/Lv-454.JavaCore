package com.company;

public class Eagle extends FlyingBird {
    @Override
    public void fly() {
        feathers();
        super.fly();
        System.out.println(" It is an  eagle. ");
    }
}
