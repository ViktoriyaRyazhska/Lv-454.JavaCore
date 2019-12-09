package com.company;

public  class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        System.out.println("I am penguim");
        super.fly();

    }
}
