import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo22 {
    public static void main(String[] args) throws IOException {
        double sum = 0, average = 0;
        int[] array= new int [4];
        int amount = 0, product=1;
        int max = array[0];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Enter number: ");
            array[i]=Integer.parseInt(reader.readLine());
            amount++;
            sum = sum + array[i];
            product = product*array[i];
            if (array[i]>max){
                max = array[i];
            }
        }
        average = sum/amount;
        System.out.println("The average of array numbers  = " + average + ", the maximum = " + max
                + ", the product of numbers = " + product);
        int minimum;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]<array[j]){
                    minimum = array[i];
                    array[i]=array[j];
                    array[j]=minimum;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
