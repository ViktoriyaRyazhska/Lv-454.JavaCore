package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first name");
        String firstName = br.readLine();
        this.firstName = firstName;
        System.out.println("Enter last name");
        String lastName = br.readLine();
        this.lastName = lastName;
        System.out.println("Enter birth year");
        int birthYear = Integer.parseInt(br.readLine());
        this.birthYear = birthYear;
    }

    public String output() {
        return "Person name: " + this.firstName + ", last name: " + this.lastName + ", birth year: " + this.birthYear +
                ", age: " + this.getAge();
    }

    public void changeName(String newFirstName, String newLastName) {
            this.firstName = newFirstName;
            this.lastName = newLastName;
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
}