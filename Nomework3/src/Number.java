import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some three numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("The maximum of the numbers you entered is " + max);
        System.out.println("The minimum of the numbers you entered is " + min);
    }
}






