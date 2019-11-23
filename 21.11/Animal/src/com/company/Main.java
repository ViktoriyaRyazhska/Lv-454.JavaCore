package com.company;

public class Main {

    public static void main(String[] args) {
Animal[] animals=new Animal[4];
        animals[0]=new Dog();
        animals[3]=new Cat();
        animals[2]=new Cat();
        animals[1]=new Dog();
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            animals[i].feed();
        }
    }
}
