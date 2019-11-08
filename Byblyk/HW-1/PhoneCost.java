import java.io.*;

public class PhoneCost {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double c1;
		double c2;
		double c3;
		double t1;
		double t2;
		double t3;
		double cost;
		String talk;
		System.out.println("Are you talking separately - s or together - t?");
		talk = br.readLine();
		switch (talk) {
		case ("s"):
			System.out.println("Enter cost in country 1");
			c1 = Double.parseDouble(br.readLine());
			System.out.println("Enter cost in country 2");
			c2 = Double.parseDouble(br.readLine());
			System.out.println("Enter cost in country 3");
			c3 = Double.parseDouble(br.readLine());
			System.out.println("Enter time of talking with country 1");
			t1 = Double.parseDouble(br.readLine());
			System.out.println("Enter time of talking with country 2");
			t2 = Double.parseDouble(br.readLine());
			System.out.println("Enter time of talking with country 3");
			t3 = Double.parseDouble(br.readLine());
			cost = c1 * t1 + c2 * t2 + c3 * t3;
			System.out.println("You must to pay" + cost + "dollars");  //final cost
			break;

		case ("t"):
			System.out.println("Enter cost in country 1");
			c1 = Double.parseDouble(br.readLine());
			System.out.println("Enter cost in country 2");
			c2 = Double.parseDouble(br.readLine());
			System.out.println("Enter cost in country 3");
			c3 = Double.parseDouble(br.readLine());
			System.out.println("Enter time of talking countries");
			t1 = Double.parseDouble(br.readLine());
			cost = (c1 + c2 + c3) * t1;
			System.out.println("you must to pay " + cost + " dollars"); //final cost

		}

	}
}
