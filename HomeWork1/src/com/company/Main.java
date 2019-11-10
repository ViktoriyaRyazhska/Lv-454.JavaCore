package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius:");
        int radius = Integer.parseInt(br.readLine());
        double perimetr = 2 * Math.PI * radius;
        System.out.println("perimetr=" + perimetr);
        double area = Math.PI * radius * radius;
        System.out.println(area);

    }
}
