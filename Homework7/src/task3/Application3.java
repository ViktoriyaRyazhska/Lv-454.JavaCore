package task3;
//Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two digits after
// the dot. Enter the text from the console that contains several occurrences of US currency.
// Display all occurrences on the screen.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application3 {
    public static void main(String[] args) throws IOException {
        String text;
        text = " Xiaomi Redmi note 8 - $156.00, Xiaomi Redmi note 7 = $139,00;" +
                " Xiaomi Redmi not 9 - $320.00; Xiaomi Redmi note 6 - $129.50; Xiaomi mi 8 - $156,00.50";
        String pattern = "\\$(\\d*)(\\.\\d{2})";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            System.out.print(text.substring(matcher.start(), matcher.end()) + "*");
        }
    }
}

