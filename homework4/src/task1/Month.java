package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
    public static void main(String[] args) throws IOException {
        int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};
        int countDays = input(days);
        System.out.println(countDays);
    }
    public static int input(int[] arr) throws IOException{
        System.out.println("Enter number of month, please ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        return arr [input-1];
    }

}
