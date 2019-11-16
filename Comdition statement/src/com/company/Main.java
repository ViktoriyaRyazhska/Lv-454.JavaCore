package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the day number: ");
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println( getDays(num));
    }
    public static String getDays(int  num){
        String days="";
        switch (num){
            case 1: days="Monday, Понеділок, Poniedziałek." ;
                break;
            case 2: days="Tuesday, Вівторок, Wtorek.";
                break;
            case 3:days="Wednesday, Середа, Środa.";
                break;
            case 4: days="Thursday, Четвер, Czwartek.";
                break;
            case 5: days="Friday, П'ятниця, Piątek.";
                break;
            case 6:days="Saturday, Субота, Sobota.";
                break;
            case 7: days="Sunday, Неділя, Niedziela.";
                break;
        }
        return days;
    }
}
