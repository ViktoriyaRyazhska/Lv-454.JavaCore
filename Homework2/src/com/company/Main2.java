package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        System.out.println("What is your name?" );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Where are you live"+" "+name);
        String adress = br.readLine();
        System.out.println("You live in"+" "+adress);



    }
}
