
public class HW_2 {

	public static void main(String[] args) {
		//Petro Ivanov
		Pers pers1 = new Pers();
		pers1.input("Oleh", "Ivanov", pers1.getAge(1999));
		pers1.output(pers1.input("Oleh", "Ivanov", pers1.getAge(1999)));
		pers1.output(pers1.chName("Petro", "Oleh", "Ivanov", pers1.getAge(1999)));
		//Vitaliy Byblyk
		Pers pers2 = new Pers();
		pers2.input("Vasyl", "Byblyk", pers1.getAge(2001));
		pers2.output(pers1.input("Vasyl", "Byblyk", pers1.getAge(2001)));
		pers2.output(pers1.chName("Vitaliy", "Vasyl", "Byblyk", pers1.getAge(2001)));
		//Ivan Vinnytskiy
		Pers pers3 = new Pers();
		pers2.input("Oleh", "Vinnytskiy", pers1.getAge(2000));
		pers2.output(pers1.input("Oleh", "Vinnytskiy", pers1.getAge(2000)));
		pers2.output(pers1.chName("Ivan", "Oleh", "Vinnytskiy", pers1.getAge(2000)));
			

	}

}

class Pers {

	private String firstName;
	private String lastName;
	private int birthYear;
	final int Date = 2019;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge(int birthYear) {
		return Date - birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;

	}

	public String output(String string) {

		System.out.println(string);
		return string;
	}

	public String input(String firstName, String lastName, int date) {
		Pers pers1 = new Pers();
		pers1.setFirstName(firstName + " ");
		String firstName1 = pers1.getFirstName();
		pers1.setLastName(lastName + " ");
		String lastName1 = pers1.getLastName();
		pers1.setBirthYear(date);
		int date1 = pers1.getBirthYear();
		return firstName1 + lastName1 + date1;
	}

	public String chName(String firstName, String newName, String lastName, int age) {
		Pers pers1 = new Pers();
		pers1.setFirstName(firstName);
		newName = pers1.getFirstName();
		return newName + " " + lastName + " " + age;
	}

}
