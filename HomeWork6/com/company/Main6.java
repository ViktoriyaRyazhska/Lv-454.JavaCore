package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Number of month");

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(br.readLine());
        System.out.println(days[month - 1]);

        int[] arr = {1, -2, 3, 4, 5, -6, 7, 8, 9, 10};
        boolean positive = true;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] < 0) {
                positive = false;
            }
            sum = sum + arr[i];

        }
        if (positive) {
            System.out.println("Sum of first 5 elements= " + sum);
        } else {


            sum = 1;
            for (int i = 5; i < 10; i++) {

                sum = sum * arr[i];


            }
            System.out.println("Product of last 5 elements= " + sum);
        }

        int[] arr1 = {-8, 1, 8, 6, -9};

        int countp = 0;
        int secondp = 0;
        for (int i = 0; i < 5; i++) {
            if (arr1[i] > 0) {
                if (countp == 1) {
                    secondp = i;
                }
                countp++;
            }

        }
        if (countp < 2) {
            System.out.println("error");
        } else {
            System.out.println(secondp);
        }
        int min = arr1[0];
        int imin = 0;
        int i = 0;
        while (i < arr1.length) {
            if (arr1[i] < min) {
                min = arr1[i];
                imin = i;
            }
            i++;
        }
        System.out.print("Min= " + min);
        System.out.println(" is in " + (imin) + " place");


        int num = 1;
        int product = 1;
        while (true) {
            num = Integer.parseInt(br.readLine());
            if (num < 0) {
                break;
            }
            product *= num;
        }
        System.out.println("Product of integer number" + product);


        Car[] cars = new Car[4];
        cars[0] = new Car("Sedan", 2005, 2.0);

        cars[1] = new Car("Yniversal", 1998, 2.2);

        cars[2] = new Car("Hetchbeck", 2010, 2.5);

        cars[3] = new Car("Sedan", 2012, 3.0);

        System.out.println("Enter year of car");
        int year = Integer.parseInt(br.readLine());

        for (Car car : cars
        ) {
            if (car.getYear() == year) {
                System.out.println(car);
            }

        }
        System.out.println("Sort cars ");
        Car tmp ;
        for (int m = 0; m < cars.length - 1; m++) {
            for (int j = m + 1; j < cars.length; j++) {
                if (cars[m].getYear() > cars[j].getYear()) {
                    tmp = cars[m];
                    cars[m] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int m = 0; m < cars.length; m++) {
            System.out.println(cars[m]);
        }

    }
}
