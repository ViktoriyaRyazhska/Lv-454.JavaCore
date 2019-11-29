import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Words {
	public static void main(String[] args) throws IOException{
		String[] input;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the sentence:");
		input = br.readLine().split(" ");	//Splitting usr input into array
		String longest = "";
		for(String i : input) { //Finding longest word in array
			if(longest.length() < i.length()) {
				longest = i;	//Maybe not a good way, but yup, a lot of strings...
			}
		}
		//Printing results
		System.out.println("The longest word: " + longest);
		System.out.println("Its length is: " + longest.length());
		//StringBuilder init for reversing word
		StringBuilder word = new StringBuilder(input[1]);
		System.out.println("Reversed second word: " + word.reverse().toString());
	}
}
