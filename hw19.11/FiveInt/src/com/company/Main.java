package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        EntArr(arr,sc);
       SecPos(arr);
       Minimum(arr);
    }
    public static void EntArr(int []arr,Scanner sc){
        System.out.println("Enter five integer numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void SecPos(int []arr){
        int add = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                add++;
                if (add == 2) {
                    i++;
                    System.out.println("Position of second positive number in array is № " + i + ". This number is " + arr[--i]);
                } else {
                    continue;
                }
            }
        }
    }
    public static void Minimum(int[]arr){
        int min=arr[0];
        int position=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                position=i;
            }
        }
        position++;
        System.out.println("Minimum number : "+min+".  Position in the array :  "+position);
    }
}