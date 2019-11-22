import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
    public static void main(String[] args) throws IOException {
        int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};

    }
    public static int input(int[] mas) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of month, please ");
        int input = Integer.parseInt(reader.readLine());
        return mas[input-1];
    }

}
