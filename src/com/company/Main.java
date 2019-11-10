package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c1,c2,c3,t1,t2,t3,cost1,cost2,cost3;
       System.out.println("Do you want to count all the calls together or separatly?");
       System.out.println("If together input-t , if separatly input-s");
     String talk = sc.nextLine();
     switch (talk){
         case ("s"): System.out.println("Enter the cost of the call  in first country ");
             c1 = Double.parseDouble(sc.nextLine());
             System.out.println("Enter time of talking with first country ");
             t1 = Double.parseDouble(sc.nextLine());
             cost1=c1*t1;
             System.out.println("Enter the cost of the call in second country ");
             c2 = Double.parseDouble(sc.nextLine());
             System.out.println("Enter time of talking with second country ");
             t2 = Double.parseDouble(sc.nextLine());
             cost2=c2*t2;
             System.out.println("Enter the  cost of the call in third country ");
             c3 = Double.parseDouble(sc.nextLine());
             System.out.println("Enter time of talking with third country ");
             t3 = Double.parseDouble(sc.nextLine());
            cost3=c3*t3;
             System.out.println("In first country you have to pay " + cost1+"$" );
             System.out.println("In second country you have to pay " + cost2+"$" );
             System.out.println("In third country you have to pay " + cost3+"$" );
             break;
         case ("t"):
             System.out.println("Enter the cost of the call in first country ");
             c1 = Double.parseDouble(sc.nextLine());
             System.out.println("Enter the cost of the call in secont country ");
             c2 = Double.parseDouble(sc.nextLine());
             System.out.println("Enter the cost of the call in third country ");
             c3 = Double.parseDouble(sc.nextLine());
             System.out.println("Enter the total talk tome in these countries");
             t1 = Double.parseDouble(sc.nextLine());
             cost1 = t1*(c1 + c2 + c3);
             System.out.println("You have to pay " + cost1+"$") ;
     }
    }
}