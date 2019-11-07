
import java.io.*;

public class Answer 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		System.out.println("How are you?");
		answer = br.readLine();
		System.out.println("You are "+answer);
		
	}
}
