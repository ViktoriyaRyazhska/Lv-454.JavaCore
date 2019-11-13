package ls3;

public class Student {

	// private int sum = 0;
	// private int count = 0;
	private String name;
	private int rate;
	private int hours;

	public static void totalSum() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSelery(int rate, int hours) {

		return rate * hours;
	}

	public double getBonuses(int rate, int hours) {

		double bonus = rate * hours;
		return bonus += (rate * hours * 0.1);
	}

	public int chRate() {
		
		
		
		return 6;

	}

	public String toString() {
		System.out.println();

		return name;

	}

}
