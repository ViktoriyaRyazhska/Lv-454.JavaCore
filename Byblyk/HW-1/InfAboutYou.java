import java.io.*;

public class Information 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String adr;
		String name;
		System.out.println("What it's your name?");
		name = br.readLine();
		System.out.println("Where are you live, "+name+"?");
		adr = br.readLine();
		System.out.println(name+" live in "+ adr);
	}
}
