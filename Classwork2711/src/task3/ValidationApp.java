package task3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationApp {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <5 ; i++) {
            String userName = reader.readLine();
            System.out.println(checkWithRegExp(userName));
        }
    }
    public static boolean checkWithRegExp(String userName) {
        Pattern pattern = Pattern.compile("^[a-z0-9-][\\$([^_]+" +
                "_{1}[^_]+)\\$]{3,15}$");
        Matcher matcher = pattern.matcher(userName);
        return matcher.matches();
    }
}
