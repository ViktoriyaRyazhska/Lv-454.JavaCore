package com.pirko.vitaliy;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setFirstName("Paul");
		p1.setLastName("Landers");
		p1.setBirthYear(1998);
		Person p2 = new Person("Vitaliy", "Pirko");
		p2.setBirthYear(2002);
		Person p3 = new Person("John", "Show");
		p3.setBirthYear(1995);
		Person p4 = new Person("Michael", "Jackson");
		p4.setBirthYear(2000);
		Person p5 = new Person("Robert", "Milligan");
		p5.setBirthYear(2001);
		
		p1.setInformation("Plays guitar");
		p2.setInformation("Loves coding");
		p3.setInformation("Loves dancin'");
		p4.setInformation("Has no hobbies!");
		p5.setInformation("Perfectly sings");
		
		p1.output();
		p2.output();
		p3.output();
		p4.output();
		p5.output();
	}

}
