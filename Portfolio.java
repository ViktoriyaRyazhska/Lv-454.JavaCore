package com.pirko.vitaliy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Portfolio {
	public static void main(String[] args) throws IOException {
		String name, address;
		byte choice = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("...Portfolio...");
		do {
			System.out.println("\n What is your name?");
			name = br.readLine();
			System.out.println("Where do you live, " + name + " ?");
			address = br.readLine();
			System.out.println("Name: " + name + "\nAddress: " + address + "\n");
			System.out.println("Want to continue?\n...No - 0\n...Yes - 1");
			choice = Byte.parseByte(br.readLine());
			while(choice < 0 || choice > 1) {
				System.out.println("Wrong choice! Tre again:");
				choice = Byte.parseByte(br.readLine());
			}
		}while (choice == 1);
	}
}
