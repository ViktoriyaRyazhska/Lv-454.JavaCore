package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array;
		array = new int[10];
		System.out.println("Enter array:");

		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		action(array);

	}

	static boolean condition(int[] arr) {
		if (arr[0] > 0 && arr[1] > 0 && arr[2] > 0 && arr[3] > 0 && arr[4] > 0) {
			return true;

		} else {
			return false;
		}
	}

	static void action(int[] arr) {

		if (condition(arr) == true) {
			int count = 0;
			for (int i = 0; i < 5; i++) {

				if (arr[i] > 0) {
					count += arr[i];
				}
			}
			System.out.println("Sum of first 5 elements: "+count);
		} else {
			int count = 1;
			for (int i = 5; i < 10; i++) {

				count *= arr[i];

			}
			System.out.println("Product of last 5 elemenrs: "+count);

		}

	}

}
