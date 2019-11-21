import java.io.*;

public class task2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Name dog: ");
		String name = br.readLine();
		switch (name) {
		case "Ball":
			System.out.println("Breed of dog: " + field_breed.Pekingese);
			break;

		case "Rem":
			System.out.println("Breed of dog: " + field_breed.Saint_Bernard);

			break;
		case "Rex":
			System.out.println("Breed of dog: " + field_breed.Labrador);

			break;
		default:
			System.out.println("Error");
			break;
		}

	}
}

class Dog {
	String name;
	String breed;
	int age;

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;

	}

}

enum field_breed {
	Saint_Bernard, Pekingese, Labrador;

}