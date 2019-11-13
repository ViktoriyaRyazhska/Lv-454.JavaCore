package com.pirko.vitaliy;

public class Person {
	private String firstName, lastName, information;
	private int birthYear;
	private final int CURRENT_YEAR = 2019;
	
	public Person() {}
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public void output() {
		System.out.println("\nFirst name: " + getFirstName() + "\nLast name: " + getLastName());
		System.out.println("Age: " + getAge() + "\nInformation: " + getInformation());
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public void changeName(String firstName, String lastName) {
		if(firstName != null) { setFirstName(firstName); }
		if(lastName != null) { setLastName(lastName); }
	}
	public int getAge() {
		return CURRENT_YEAR - birthYear;
	}
}
