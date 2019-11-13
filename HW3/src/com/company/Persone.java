package com.company;


import java.util.Scanner;

public class Persone {
    public int  birthYear;
    public String firstName;
    public String lastName;
    private String setFirstName;

    void setLastName(String lastName){
        this.lastName=lastName;
    }
    void setFirstName(String firstName){
        this.firstName=firstName;
    }
    void setBirthYear(int birthYear){
        this.birthYear=birthYear;
    }
    String getFirstName(){
        return this.firstName;
    }
    String getLastName(){
        return this.lastName;
    }
    int getBirthYear(){
        return this.birthYear;
    }
    Persone(){}
    Persone(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public int getAge(){
        return 2019-getBirthYear();
    }
    public void input(Scanner sc){

        System.out.println("Input name: ");
        firstName=sc.next();
        System.out.println("Input lastname "+getFirstName()+": ");
        lastName=sc.next();
        System.out.println("Input the birthday year "+getLastName()+" "+getFirstName()+":");
        birthYear=sc.nextInt();
    }
public void output(){
    System.out.println("Persone  ( Name: "+getFirstName()+", Lastname: "+getLastName()+", Age: "+getAge()+" . )");
}

}
