package com.company;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
Swallow s=new Swallow();
        Chicken c = new Chicken();
        Penguin p = new Penguin();
        Eagle e=new Eagle();
        System.out.println();
        Bird[] arr = {p,s,c,e};
        for (int i = 0; i < arr.length; i++) {

            arr[i].fly();

            System.out.println("------------------------------------------------------------------------------------------");
        }
    }
}
