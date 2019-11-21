package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        Car tmp;
Car car1=new Car();
        car1.setModel(" Mersedes-Benz");
        car1.setYear(2014);
        car1.setCapacity(2.5);
Car car2=new Car();
        car2.setModel("BMW");
        car2.setYear(2013);
        car2.setCapacity(3.0);
Car car3=new Car();
        car3.setModel("Audi");
        car3.setYear(2012);
        car3.setCapacity(2.2);
Car car4=new Car();
        car4.setModel("Kia");
        car4.setYear(2015);
        car4.setCapacity(1.7);
        System.out.println("Enter year the machine: ");
        year=sc.nextInt();
        Car []arr={car1,car2,car3,car4};
        for (int i=0;i<arr.length;i++){
        if (year==arr[i].getYear()){
            System.out.println("From this year there are "+arr[i].getModel());
        }else{
            continue;
        }
    }
        System.out.println();
        System.out.println("Sor");
for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i].getYear()<arr[j].getYear()){
            tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
        }
    }
}
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }
}
