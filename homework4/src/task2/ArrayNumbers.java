package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayNumbers {
    public static void main(String[] args) throws Exception
    {
        int[] myArray = initializeArray();
        int sumFirstFive = sum(myArray);
        int productLastFive = product(myArray);
        print(myArray);
    }
    public static int[] initializeArray() throws IOException {
        int[] arr = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(reader.readLine());
        }
        return arr;
    }
    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            if (array[i]>0)
                sum+= array[i];
        }return sum;
    }

    public static int product(int[]array){
        int product = 1;
        for (int i = 5; i < array.length; i++) {
            if (array[i]!=0){
                product = product*array[i];
            }
        } return product;
    }
    public static void print(int[] array){
        System.out.println("The sum of first 5 elements is " + sum(array));
        System.out.println("The product of last 5 elements is " + product(array));
    }
}