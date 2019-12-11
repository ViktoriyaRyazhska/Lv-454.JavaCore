package com.company;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.print("Voice: Gav. ");
    }

    @Override
    public void feed() {
        System.out.println("Feed: Meat.");
    }
}
