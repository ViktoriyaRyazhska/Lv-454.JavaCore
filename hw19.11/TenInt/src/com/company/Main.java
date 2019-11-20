package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum =0,add=0, suma=1;
		boolean last5=false;
		System.out.println(" Enter ten integer numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
			for (int i = 0; i < 5; i++) {
				if (arr[i]> 0 ) {
					add++;
					if(add<=5){
						sum = sum + arr[i];}
				}
			}
			if (add==5) {
				System.out.println("The sum of the first 5 elements ="+sum);
				last5=true;
			}else{last5=false;}
if (last5==false){
	for (int i = 6; i <arr.length; i++) {
		suma = suma * arr[i];
		}
	System.out.println("The product of the last 5 element = "+suma);
}

		}
			}


