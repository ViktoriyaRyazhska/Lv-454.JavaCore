package com.company;
public class Main {

	public static void main(String[] args) {
		
		Dog Rokki = new Dog("Rokki", 22, Breed.mastif);
        Dog Lokki = new Dog("Lokki", 26, Breed.bulldog);
        Dog Bob = new Dog("Bob", 19, Breed.doberman);
        System.out.println(Rokki);
        System.out.println(Lokki);
        System.out.println(Bob);

        if (Rokki.getName() == Lokki.getName()) {
            System.out.println(" Dog1 and Dog2 with the same name");

        }
        if (Lokki.getName() == Bob.getName()) {
            System.out.println(" Dog2 and Dog3 with the same name");

        }
        if (Rokki.getName() == Bob.getName()) {
            System.out.println(" Dog2 and Dog3 with the same name");
        }
        Dog Oldest = Rokki;
        if (Lokki.getAge() > Oldest.getAge()) {
            Oldest = Lokki;
        }
        if (Bob.getAge() > Oldest.getAge()) {
            Oldest = Bob;
        }
        System.out.println("The oldest dog " + Oldest);
    }




		
	}


