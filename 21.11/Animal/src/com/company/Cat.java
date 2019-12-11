package com.company;

public class Cat extends Animal{
    @Override
    public void voice() {
System.out.print("Voice: Myav. ");
    }

    @Override
    public void feed() {
        System.out.println("Feed: Milk.");
    }
}
