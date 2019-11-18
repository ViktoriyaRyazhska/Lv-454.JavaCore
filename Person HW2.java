package com.company;


import java.time.LocalDate;
import java.util.Scanner;

public class Person {
 Scanner sc =  new Scanner(System.in);
    public String name;
    public int birthYear;
//    public String info = sc.nextLine();
//    public String name = sc.nextLine();
//

    public Person() {

    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }



    public int getAge(){
        return (LocalDate.now().getYear() - birthYear);
    }

    public void getInput(Scanner sc){
        System.out.println("name");
        this.name=sc.nextLine();

        System.out.println("age");
        this.birthYear=sc.nextInt();

    }

//    public String changeName(){
//    return (Name + "- this is old name" + "this one is your new name: " + sc.nextLine());
//    }




    @Override
    public String toString() {
        return "Person{" +
                "sc=" + sc +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear;
                    }
}