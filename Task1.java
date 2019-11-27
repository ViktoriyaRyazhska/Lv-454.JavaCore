import java.util.Scanner;

public class Task1 {
 
    public static void main(String args[]) {
 
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.println("Please enter first number :");
        int first = scanner.nextInt();
 
        System.out.println("Please enter second number :");
        int second = scanner.nextInt();
 
        System.out.println("Please enter third number :");
        int third = scanner.nextInt();
 
        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);
 
        System.out.printf("max of three numbers %d, %d, and %d is : %d %n",
                first, second, third, largest);
        System.out.printf("min of three numbers %d, %d, and %d is : %d %n", 
            first, second, third, smallest);

 
        scanner.close();
    }

	private static int smallest(int first, int second, int third) {
		
		return 0;
	}

	private static int largest(int first, int second, int third) {
		
		return 0;
	}
}


	
