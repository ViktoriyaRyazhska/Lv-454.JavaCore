package task7;

public class Random {

	public static int rand(int n) {
		int a;
		int count = 0;
		for (int i = 0; i < n; i++) {
			a = (int) (Math.random() * (2 - 0));
			if (a == 1) {
				count++;

			}
		}

		return count;
	}

}
