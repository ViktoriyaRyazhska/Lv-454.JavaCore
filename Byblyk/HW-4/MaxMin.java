import java.io.*;

public class MaxMin {
	public static void main(String[] args) throws IOException {

		double a, b, c;
		Input input = new Input();
		a = input.funk();
		b = input.funk();
		c = input.funk();
		System.out.println("Max= "+input.max(a, b, c));
		System.out.println("Min= "+input.min(a, b, c));
	}
}

class Input {
	int funk() throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());

		return num;
	}

	int max(double a, double b, double c) {
		double[] arr = new double[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		double max = arr[0];
		double imax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				imax = i;
			}

		}

		return (int) max;
	}

	int min(double a, double b, double c) {

		double[] arr = new double[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		double min = arr[0];
		double imax = 0;
 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				imax = i;
			}

		}
		return (int) min;
	}

}