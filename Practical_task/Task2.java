import java.io.*; 
import java.lang.Math; 

class Task2 { 
	
	public static void primeFactors(int n) { 
		
		for (int i = 3; i <= Math.sqrt(n); i+= 2) 
		{ 
			
			while (n%i == 0) 
			{ 
				System.out.print(i + " "); 
				n /= i; 
			} 
		} 

		if (n > 2) 
			System.out.print(n); 
	} 

	public static void main (String[] args) 
	{ 
		int n = 84; 
		primeFactors(n); 
	} 
} 
