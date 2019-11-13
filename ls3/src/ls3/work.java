package ls3;

public class work {

	public static void main(String[] args) {
		Student worcker1 = new Student();
		worcker1.setName("Oleh");
		String nameW1 = worcker1.getName();
		System.out.println(nameW1);
		worcker1.setHours(100);
		int hoursW1 = worcker1.getHours();
		System.out.println(hoursW1);
		worcker1.setRate(30);
		int rateW1 = worcker1.getRate();
		System.out.println(rateW1);
		double Selery = worcker1.getSelery(worcker1.getRate(), worcker1.getHours());
		System.out.println(Selery);
		double bonus = worcker1.getBonuses(worcker1.getRate(), worcker1.getHours());
		System.out.println(bonus);

	}

}
