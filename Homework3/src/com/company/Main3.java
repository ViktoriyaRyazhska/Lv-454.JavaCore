package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main3 {

    public static void main(String[] args) throws IOException {
        input();
    }

    public static void input() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("units of calls to first country");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("units of calls to second country");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("units of calls to third country");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("units of calls to first country");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("units of calls to second country");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("units of calls to third country");
        int t3 = Integer.parseInt(br.readLine());
int res1 = c1*t1;
int res2 = c2*t2;
int res3 = c3*t3;
        System.out.println("Units of first calls "+res1+"\nUnits of second calls"+res2+"\nUnits of third calls"+res3);
        int sum = res1+res2+res3;
        System.out.println(sum);

    }
}
