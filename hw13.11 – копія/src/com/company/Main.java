package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
     System.out.println("Enter three integer numbers:");
      IntNumbers(sc);
        System.out.println("Enter three floating numbers:");
        FlNumbers(sc);
        //System.out.println("Enter number of HTTP error:");

    }
    public static int IntNumbers(Scanner sc){
        int num[]= new int[3];
        int number, max=0,min=2147483647;
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
            if (num[i]>max){
                max=num[i];
            }
            if (num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Max-  "+max+",  min-  "+min+" .");
        return 0;
    }
    public static float FlNumbers(Scanner sc){
        int belong=0;
        float num[]=new float[3];
        float range[]={-5,-4,-3,-2,-1,0,1,2,3,4,5};
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextFloat();
            for (int  j=0;j<range.length;j++){
                if (num[i]==range[j])
                {
                    belong++;
                }
            }
        }
        if (belong==3){
            System.out.println(" They all belong to the range [-5,5]");
        }
        else{
            System.out.println("They all aren't belong to the range [-5,5] ");
        }
        return 0;
    }

}
