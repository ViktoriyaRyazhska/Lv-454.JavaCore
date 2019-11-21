package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array;
		array = new int[5];
		System.out.println("Enter array:");

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		findSec(array);
		min(array);
	}

	static void findSec(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;

			}
			if (count == 2) {
				System.out.println("Second positive element " + arr[i]);
			}
		}
	}

	static void min(int[] arr) {
		int min = arr[0];
		int imin = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}
		}
		System.out.println("Minimum: " + min);
		for (int i = 0; i < arr.length; i++) {
			if (min == arr[i]) {
				System.out.println("Position of minimum: " + i++);
			}
		}

	}
}
