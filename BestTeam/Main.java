package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random random = new Random();
		Factoriall factoriall = new Factoriall();
		String con = "y";

		while (con == "y") {

			System.out.println("Enter task: \n" + "7 - Input number n and calculate n!  \n"
					+ "9 - random value 0 or 1. Input number n, how many times were number one\n");
			int x;
			x = input();

			switch (x) {
			case 7:
				System.out.println("Enter number:");
				int number;
				number = input();
				System.out.println(Factoriall.fact(number));
				break;
			case 9:
				System.out.println("Enter n:");
				int n = input();
				System.out.println(Random.rand(n));
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + 1);
			}
			System.out.println("Continue y or n?");
			
		}

	}

	public static int input() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		return x;

	}
}
