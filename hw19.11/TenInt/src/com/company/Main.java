package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		boolean last5 = false;
		EntMun(arr,sc);
		SumFirst(arr,last5);
	}
	public static void EntMun(int []arr,Scanner sc) {  //Заповнення масива десятьма числами.
		System.out.println(" Enter ten integer numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void SumFirst(int []arr,boolean last5) { //Перевірка перших п'ять чисел .
		int sum = 0, add = 0;
		for (int i = 0; i < 5; i++) {
			if (arr[i] > 0) {
				add++;
				if (add <= 5) {
					sum = sum + arr[i];
				}
			}
		}
		if (add == 5) {
			System.out.println("The sum of the first 5 elements =" + sum);
			last5 = true;
		} else {
			last5 = false;
		}
		int suma = 1;
		if (last5 == false) {
			for (int i = 5; i <arr.length; ) {
				suma = suma * arr[i];
				++i;
			}
			System.out.println("The product of the last 5 element = " + suma);
		}
	}
			}


