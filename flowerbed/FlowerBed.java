package com.example.flowerbed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number, please");
        int radius = Integer.parseInt(br.readLine());
        float area = (float) (Math.PI*(radius*radius));
        System.out.println("The area of the flowerbed is " + area + " square meters");
        float circumference = (float) (2* Math.PI*radius);
        System.out.println("The perimeter of the flowerbed " + circumference + " meters");
    }
}
