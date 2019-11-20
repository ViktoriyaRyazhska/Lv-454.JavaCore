package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number to check are they belong to the range [-5] [5]");
        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        float c = Float.parseFloat(br.readLine());

        if (a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5) {
            System.out.println("All numbers belong to the range");
        } else {
            System.out.println("Not all numbers belong to the range");
        }
        System.out.println("Enter number to check on max and min");

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());


        int min = a1, max = a1;
        if (a2 < a1) {
            min = a2;

        }
        if (min > a3) {
            min = a3;
        }
        if (a2 > max) {
            max = a2;
        }
        if (a3 > max) {
            max = a3;
        }
        System.out.println("Min =" + min + " Max =" + max);
        System.out.println("Chose error");
        int er1 = Integer.parseInt(br.readLine());
        if (er1 == 400) {
            System.out.println("Server cant to process the request");
        } else if (er1 == 401) {
            System.out.println("Server doesnt have acsses");

        } else if (er1 == 402) {
            System.out.println("Program founded virus");

        } else {
            System.out.println("Error not found");
        }


        Dog dog1 = new Dog("boobik", 22, Breed.Dvornyha);
        Dog dog2 = new Dog("tuzik", 26, Breed.Alabay);
        Dog dog3 = new Dog("bob", 19, Breed.Mastif);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        if (dog1.getName() == dog2.getName()) {
            System.out.println(" Dog1 and Dog2 with the same name");

        }
        if (dog2.getName() == dog3.getName()) {
            System.out.println(" Dog2 and Dog3 with the same name");

        }
        if (dog1.getName() == dog3.getName()) {
            System.out.println(" Dog2 and Dog3 with the same name");
        }
        Dog Oldest = dog1;
        if (dog2.getAge() > Oldest.getAge()) {
            Oldest = dog2;
        }
        if (dog3.getAge() > Oldest.getAge()) {
            Oldest = dog3;
        }
        System.out.println("The oldest dog " + Oldest);
    }


}


