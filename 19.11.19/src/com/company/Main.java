package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.");
        int arr[] = { 2, 22, -13, 53, 1, 0, -45, 7, 45, 10 };
        System.out.println("The biggest of these numbers: " + BigNum(arr));
        System.out.println("The sum positive numbers in the array: " + SumPos(arr));
        System.out.println("The amount of negative numbers in the array: " + AmNeg(arr));
        System.out.println("There are more " + MoreVal(arr) + " values");
        System.out.println();
        System.out.println("2.");

//2.
        Employee em1 = new Employee();
        em1.setName("Anriy");
        em1.setDepnum(2);
        em1.setSalary(28457.50);
        Employee em2 = new Employee();
        em2.setName("Roman");
        em2.setDepnum(2);
        em2.setSalary(29457.60);
        Employee em3 = new Employee();
        em3.setName("Taras");
        em3.setDepnum(7);
        em3.setSalary(33457.50);
        Employee em4 = new Employee();
        em4.setName("Nadya");
        em4.setDepnum(2);
        em4.setSalary(42457.80);
        Employee em5 = new Employee();
        em5.setName("Katya");
        em5.setDepnum(5);
        em5.setSalary(72457.80);
        Employee[] em = { em1, em2, em3, em4, em5 };
        for (int i = 0; i < em.length; i++) {

            System.out.println(em[i]);
        }
        int dep = 2;
        System.out.println();
        Employee.printEm(5, em);
        System.out.println();
        Employee.Salary(em);
    }
    // 1.
    static int SumPos(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return sum;

    }

    static int BigNum(int[] arr) {
        int big = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (big < arr[i]) {
                big = arr[i];
            }
        }
        return big;
    }

    static int AmNeg(int[] arr) {
        int amount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ++amount;
            }
        }
        return amount;
    }

    static String MoreVal(int[] arr) {
        int negative = 0;
        int positive = 0;
        String morevalue = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
        }
        if (negative > positive) {
            morevalue = " negarive ";
        } else {
            morevalue = " positive ";
        }
        return morevalue;
    }
}