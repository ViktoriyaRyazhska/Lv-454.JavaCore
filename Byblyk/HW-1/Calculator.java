
import java.io.*;

public class My  
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double sum;
		String op ;
		System.out.println("please enter a:");
		a = Double.parseDouble(br.readLine());
		System.out.println("please enter b:");
		b = Double.parseDouble(br.readLine());
		System.out.println("please choose operstion");
		op = br.readLine();
		
		switch(op) 
		{
		case ("+"):
			sum = a + b;
		System.out.println("a + b = "+sum);
			break;
		case ("-"):
			sum = a - b;
		System.out.println("a - b = "+sum);
			break;
		case ("*"):
			sum = a * b;
		System.out.println("a * b = "+sum);
			break;
		case ("/"):
			sum = a / b;
		System.out.println("a / b = "+sum);
			break;
			
		}
	
	
	}
}
