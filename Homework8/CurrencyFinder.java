import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Uses outer class file "TextAnalizer.java"!
public class CurrencyFinder {

	public static void main(String[] args) throws IOException{
		String input, pattern = "[$0-9]+[.]+[0-9]{2}";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence:");
		input = br.readLine();
		System.out.println("Currence values in your sentence:\n"
		+ TextAnalizer.analize(pattern, input, '\n'));
	}

}
