package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        int[] array= new int [10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 10 numbers please ");
        for (int i = 0; i <array.length ; i++) {
            try {
                array[i]= Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static int readNumber(int start,int end){


    }
}
