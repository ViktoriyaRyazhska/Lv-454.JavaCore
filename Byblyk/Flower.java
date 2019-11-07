import java.io.*;

public class Flower 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double pi = 3.14159;
		double r;
		double l;
		double area;
		System.out.println("Please enter radius of cloumb");
		r = Double.parseDouble(br.readLine());
		l = 2*pi*r;
		area = pi*r*r;
		System.out.println("lenth = "+ l);
		System.out.println("area = " +area);
	}
}
