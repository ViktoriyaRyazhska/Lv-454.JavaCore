import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Float_Num {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double a, b, c;
		System.out.println("Enter the first number");
		a = Double.parseDouble(in.readLine());
		System.out.println("Enter the second number");
		b = Double.parseDouble(in.readLine());
		System.out.println("Enter the third number");
		c = Double.parseDouble(in.readLine());
		Numb numb = new Numb();
		numb.funk(a);
		numb.funk(b);
		numb.funk(c);

	}

}

class Numb {
	
	boolean funk(double num) {
		if (num >= -5 && num <= 5) {
			System.out.println(num + "- belong to the range [-5;5]");
			return true;
		}

		else {
			System.out.println(num + "- don't belong to the range [-5;5]");

			return false;
		}
	}
}
