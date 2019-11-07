package com.pirko.vitaliy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	public static void main(String[] args) throws IOException {
		byte choice = 1;
		float r, p, s;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("...Flower bed calculator...");
		do {
			System.out.print("\nInput radius: ");
			r = Float.parseFloat(br.readLine());
			System.out.println();
			p = (float)(2 * Math.PI * r);
			s = (float)(Math.PI * Math.pow(r, 2));
			System.out.println("Perimeter: " + p);
			System.out.println("Area: " + s + "\n");
			System.out.println("Want to continue?\n...No - 0\n...Yes - 1");
			choice = Byte.parseByte(br.readLine());
			while(choice < 0 || choice > 1) {
				System.out.println("Wrong choice! Try again:");
				choice = Byte.parseByte(br.readLine());
			}
		}while(choice == 1);
	}
}
