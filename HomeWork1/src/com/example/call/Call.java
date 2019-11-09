package com.example.call;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Call {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter c1");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("Enter c2");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("Enter c3");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("Enter t1");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("Enter t2");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("Enter t3");
        int t3 = Integer.parseInt(br.readLine());
        int price1= c1*t1;
        int price2 = c2*t2;
        int price3 = c2*t2;
        int total = price1+price2+price3;
        System.out.println("A call to Ukraine will cost " + price1 + " USD.");
        System.out.println("A call to Poland will cost " + price2 + " USD.");
        System.out.println("A call to Germany will cost " + price3 + " USD.");
        System.out.println("A total check for all talks " + total + " USD.");
    }
}
