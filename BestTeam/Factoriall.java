package task7;

public class Factoriall {

	public static int fact(int numb) {
		int res = 1;
		for (int i = 2; i < numb + 1; ++i) {
			res *= i;

		}
		return res;
	}
}
