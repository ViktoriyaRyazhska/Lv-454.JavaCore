import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void isPalendrom () throws IOException {
        String a, b = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System. out. print("Enter the string you want to check: ");

        a = br.readLine();
        int n = a. length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
    }

