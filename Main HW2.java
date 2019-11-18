package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //info = sc.nextLine();
        Person p1 = new Person();
        p1.getInput(sc);
        System.out.println(p1.getAge());
        p1.getBirthYear();
        
        Person p2 = new Person();
        p1.getInput(sc);
        System.out.println(p1.getAge());
        p1.getBirthYear();
        
        Person p3 = new Person();
        p1.getInput(sc);
        System.out.println(p1.getAge());
        p1.getBirthYear();
        
        Person p4 = new Person();
        p1.getInput(sc);
        System.out.println(p1.getAge());
        p1.getBirthYear();
        
        Person p5 = new Person();
        p1.getInput(sc);
        System.out.println(p1.getAge());
        p1.getBirthYear();
   }
    
    
}