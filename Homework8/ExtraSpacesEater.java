import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Uses outer class file "TextAnalizer.java"!
public class ExtraSpacesEater {

	public static void main(String[] args) throws IOException{
		String input, pattern = "\\S+";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter sentence:");
		input = br.readLine();
		System.out.println("Sentence without extra spaces: "
		+ TextAnalizer.analize(pattern, input, ' '));
	}

}
