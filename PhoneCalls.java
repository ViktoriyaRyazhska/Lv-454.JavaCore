package com.pirko.vitaliy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
	public static void main(String[] args) throws IOException {
		float cost, time, allCost = 0;
		float[] costPerTime = new float[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("...Phone calls...");
		for(int i = 0; i < 3; i++) {
			System.out.println("Input cost" + (i + 1) + ":");
			cost = Float.parseFloat(br.readLine());
			System.out.println("Input time" + (i + 1) + ":");
			time = Float.parseFloat(br.readLine());
			costPerTime[i] = cost * time;
			allCost += costPerTime[i];
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("\nCost"+ (i + 1) + ": " + costPerTime[i]);
		}
		System.out.println("Sum: " + allCost);
	}
}
