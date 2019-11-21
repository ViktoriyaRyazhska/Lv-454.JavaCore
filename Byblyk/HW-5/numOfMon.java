import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numOfMon {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int[] array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int count;
		String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int con = 1;
		do {
			System.out.println("Enter number of month:");
			count = input();
			if (count <= 0 || count > 12) {
				System.out.println("ERROR");
				continue;
			} else {
				System.out.println(count + "- " + month[count-1] + " has " + array[count-1] + " days");
			System.out.println("1- continue \n2- exit");	
			}
			con = input();

		}
		while (con == 1);

	}

	static int input() throws NumberFormatException, IOException {
		int a = Integer.parseInt(br.readLine());
		return a;
	}

}
