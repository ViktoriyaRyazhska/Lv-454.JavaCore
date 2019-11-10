import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
		
		String name;
		String adress;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name1 = sc.nextLine();
		System.out.println("Where are yoy live?");
		int adress1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("My name is =" + name1);
		System.out.println("Naukova is =" + adress1);
		
		
	}

}
