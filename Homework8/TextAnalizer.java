import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextAnalizer {
	public static String analize(String pattern, String input, char divider) {
		String result = "";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		while(m.find()) {
			result += input.substring(m.start(), m.end()) + divider;
		}
		return result;
	}
}
