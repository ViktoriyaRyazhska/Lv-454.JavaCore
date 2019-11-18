package com.company;

import java.io.IOException;

public class Main4 {

    public static void main(String[] args) throws IOException {
        Person person1 = new Person();
        person1.input();
        System.out.println(person1.output());
        person1.changeName("Ivan","Ivanovych");
        System.out.println("After changes: " + person1.output());
        Person person2 = new Person();
        person2.input();
        System.out.println(person1.output());
        person1.changeName("Bob","Bobskyi");
        System.out.println("After changes: " + person1.output());
        Person person3 = new Person();
        person3.input();
        System.out.println(person1.output());
        person1.changeName("Sergo","Lev");
        System.out.println("After changes: " + person1.output());
        Person person4 = new Person();
        person4.input();
        System.out.println(person1.output());
        person1.changeName("Petro","Mostavchyk");
        System.out.println("After changes: " + person1.output());
        Person person5 = new Person();
        person5.input();
        System.out.println(person1.output());
        person1.changeName("Anastasia","Dobranska");
        System.out.println("After changes: " + person1.output());
    }

}

