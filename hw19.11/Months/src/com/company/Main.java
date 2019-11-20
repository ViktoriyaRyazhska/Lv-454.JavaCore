package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num;
    int []arr=new int[13];
    for (int i=0;i<arr.length;i++){
        arr[i]=i+1;
    }
    System.out.println("Enter numter of month:");
    num=sc.nextInt();
switch (arr[num]-1){
    case 1:System.out.println("January has 31 days");
        break;
    case 2: System.out.println("February has 28 or 29 days");break;
    case 3:System.out.println("March has 31 days");break;
    case 4:System.out.println("April has 30 days");break;
    case 5:System.out.println("May has 31 days");break;
    case 6:System.out.println("June has 30 days");break;
    case 7:System.out.println("July has 31 days");break;
    case 8:System.out.println("August has 31 days");break;
    case 9:System.out.println("September has 30 days");break;
    case 10:System.out.println("October has 31 days");break;
    case 11:System.out.println("November has 30 days");break;
    case 12:System.out.println("December has 31 days");break;
    default :System.out.println("We don't know this month") ;
}











      /*  switch(getMonth(sc)) {
            case JANUARY:System.out.println("January has 31 days");
            break;
            case FEBRUARY:System.out.println("February has 28 or 29 days");break;
            case MARCH:System.out.println("March has 31 days");break;
            case APRIL:System.out.println("April has 30 days");break;
            case MAY:System.out.println("May has 31 days");break;
            case JUNE:System.out.println("June has 30 days");break;
            case JULY:System.out.println("July has 31 days");break;
            case AUGUST:System.out.println("August has 31 days");break;
            case SEPTEMBER:System.out.println("September has 30 days");break;
            case OCTOBER:System.out.println("October has 31 days");break;
            case NOVEMBER:System.out.println("November has 30 days");break;
            case DECEMBER:System.out.println("December has 31 days");break;
            case Newidoma:System.out.println("We don't know this month");break;
        }
    }
    public static month getMonth(Scanner sc) {
        int num;
        System.out.println("Enter number of month:");
        num=sc.nextInt();
        switch(num) {
            case 1:return  month.JANUARY;
            case 2: return month.FEBRUARY;
            case 3:return month.MARCH;
            case 4:return month.APRIL;
            case 5:return month.MAY;
            case 6: return month.JUNE;
            case 7: return month.JULY;
            case 8:return month.AUGUST;
            case 9:return month.SEPTEMBER;
            case 10 : return month.OCTOBER;
            case 11:return month.NOVEMBER;
            case 12:return month.DECEMBER;
            default: return month.Newidoma;
        }*/
    }
}
